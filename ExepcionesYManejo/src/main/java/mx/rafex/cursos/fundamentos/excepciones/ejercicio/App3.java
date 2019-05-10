package mx.rafex.cursos.fundamentos.excepciones.ejercicio;

import java.util.Scanner;

public class App3 {

    public static void main(final String[] args) {

        Scanner entradaPorTeclado = null;
        int numeroUno = 0;
        int numeroDos = 0;
        String operacion = null;

        entradaPorTeclado = new Scanner(System.in);
        System.out.println("Inserte el primer núermo");
        numeroUno = entradaPorTeclado.nextInt();

        entradaPorTeclado = new Scanner(System.in);
        System.out.println("Inserte el segundo núermo");
        numeroDos = entradaPorTeclado.nextInt();

        entradaPorTeclado = new Scanner(System.in);
        System.out.println("Inserte la operación");
        System.out.println("SUMA");
        System.out.println("RESTA");
        System.out.println("DIVISION");
        System.out.println("MULTIPLICACION");
        operacion = entradaPorTeclado.next();

        TipoOperaciones operacionEnum = null;

        operacionEnum = TipoOperaciones.valueOf(operacion.toUpperCase());

        int resultado = 0;
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
