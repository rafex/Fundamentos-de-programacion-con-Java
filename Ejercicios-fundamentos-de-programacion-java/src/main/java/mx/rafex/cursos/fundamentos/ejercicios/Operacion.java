package mx.rafex.cursos.fundamentos.ejercicios;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Operacion {

    private final TablaCalculadora TABLA = new TablaCalculadora();

    public double ejecutar(final Operaciones operacion, final double a, final double b) {
        final Calculadora c = new Calculadora();

        double resultado = 0;
        switch (operacion) {

            case SUMA:
            case S:
                resultado = c.suma(a, b);
                break;
            case DIVISION:
            case D:
                resultado = c.division(a, b);
                break;
            case RESTA:
            case R:
                resultado = c.resta(a, b);
                break;
            case MULTIPLICACION:
            case M:
                resultado = c.multiplicacion(a, b);
                break;
        }

        System.out.println("Número uno: " + a);
        System.out.println("Número dos: " + b);
        System.out.println("El resultado de la operación: " + operacion.getNombreOperacion() + " es: " + resultado);

        return resultado;
    }

    public double ejecutar(final Operaciones operacion) {

        double a = 0;
        double b = 0;
        double c = 0;
        boolean ciclar = false;
        Scanner s = null;

        try {

            do
                try {
                    System.out.println("");
                    System.out.println("Inserte el primer número");
                    s = new Scanner(System.in);
                    a = s.nextDouble();
                    ciclar = false;
                } catch (final InputMismatchException e) {
                    System.err.println("Número invalido");
                    ciclar = true;
                }
            while (ciclar);

            do
                try {
                    System.out.println("");
                    System.out.println("Inserte el segundo número");
                    s = new Scanner(System.in);
                    b = s.nextDouble();
                    ciclar = false;
                } catch (final InputMismatchException e) {
                    System.err.println("Número invalido");
                    ciclar = true;
                }
            while (ciclar);

            c = ejecutar(operacion, a, b);
            TABLA.insertarResultado(operacion, a, b, c);
            return c;

        } catch (final IllegalStateException e) {
            System.err.println("Error en la captura de datos");
            System.exit(0);
        }

        finally {
            if (s != null)
                try {
                    s.close();
                } catch (final IllegalStateException e) {

                }
        }

        return 0;
    }

}
