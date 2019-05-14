package mx.rafex.cursos.fundamentos.excepciones.ejercicio;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(final String[] args) {

        Scanner entradaPorTeclado = null;
        int numeroUno = 0;
        int numeroDos = 0;
        String operacion = null;
        TipoOperaciones operacionEnum = null;
        int resultado = 0;
        Boolean noEsNumero = false;
        Boolean opcionValida = false;

        do {
            try {

                entradaPorTeclado = new Scanner(System.in);
                System.out.println("Inserte el primer núermo");
                numeroUno = entradaPorTeclado.nextInt();
                noEsNumero = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número váido");
                noEsNumero = true;
            }

        } while (noEsNumero);

        do {
            try {
                entradaPorTeclado = new Scanner(System.in);
                System.out.println("Inserte el segundo núermo");
                numeroDos = entradaPorTeclado.nextInt();
                noEsNumero = false;
            } catch (final InputMismatchException e) {
                System.out.println("Inserte un número váido");
                noEsNumero = true;
            }
        } while (noEsNumero);

        do {
            try {
                entradaPorTeclado = new Scanner(System.in);
                System.out.println("Inserte la operación");
                System.out.println("SUMA");
                System.out.println("RESTA");
                System.out.println("DIVISION");
                System.out.println("MULTIPLICACION");
                operacion = entradaPorTeclado.next();

                operacionEnum = TipoOperaciones.valueOf(operacion.toUpperCase());

                opcionValida = false;
            } catch (final InputMismatchException e) {
                System.out.println("Operación invalida, vuelva a intentar");
                opcionValida = true;
            } catch (IllegalArgumentException | NullPointerException ex) {
                System.out.println("Operación invalida, se termina el programa, bye!!!");
                opcionValida = true;
            }
        } while (opcionValida);

        System.out.println("El número uno es: " + numeroUno);
        System.out.println("El número dos es: " + numeroDos);

        switch (operacionEnum) {
        case SUMA:
            resultado = numeroUno + numeroDos;
            System.out.println("El resultado de la operación " + TipoOperaciones.SUMA + " es: " + resultado);
            break;
        case RESTA:
            resultado = numeroUno - numeroDos;
            System.out.println("El resultado de la operación " + TipoOperaciones.RESTA + " es: " + resultado);
            break;
        case MULTIPLICACION:
            resultado = numeroUno * numeroDos;
            System.out.println("El resultado de la operación " + TipoOperaciones.MULTIPLICACION + " es: " + resultado);
            break;
        case DIVISION:
            resultado = numeroUno / numeroDos;
            System.out.println("El resultado de la operación " + TipoOperaciones.DIVISION + " es: " + resultado);
            break;
        default:
            System.out.println("Error en la operación bye!!");
            break;

        }

        if (entradaPorTeclado != null) {
            entradaPorTeclado.close();
        }

    }
}
