package mx.rafex.cursos.fundamentos.excepciones;

import java.util.Scanner;

public class SinManejarExcepciones {

    public static void main(final String[] args) {

        Scanner entrada;

        int numero = 0;
        System.out.println("Inserta el un número");
        entrada = new Scanner(System.in);
        numero = entrada.nextInt();
        System.out.println("El número que inserto es: " + numero);

    }

}
