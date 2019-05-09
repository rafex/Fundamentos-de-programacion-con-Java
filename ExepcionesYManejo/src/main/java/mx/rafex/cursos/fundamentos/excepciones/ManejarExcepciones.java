package mx.rafex.cursos.fundamentos.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ManejarExcepciones {

    public static void main(final String[] args) {

        Scanner entrada = null;

        int numero = 0;
        System.out.println("Inserta el un número");

        try {

            entrada = new Scanner(System.in);
            numero = entrada.nextInt();
            System.out.println("El número que inserto es: " + numero);

        } catch (final InputMismatchException ex) {

            System.out.println("Inserto un valor inesperado, se terminara el programa.");

        } catch (final IllegalStateException ex) {

            System.out.println("Inserto un valor inesperado, se terminara el programa.");

        }

    }

}
