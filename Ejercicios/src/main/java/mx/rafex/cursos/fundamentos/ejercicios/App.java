package mx.rafex.cursos.fundamentos.ejercicios;

import java.nio.charset.StandardCharsets;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    private final static Menu MENU = new Menu();

    public static void main(final String[] args) {

        int opcionMenu = 0;
        boolean ciclar = false;
        Scanner s;
        String operacionSeleccionada = null;

        try {
            do {
                s = new Scanner(System.in, StandardCharsets.UTF_8.name());
                MENU.inicial();
                try {
                    opcionMenu = s.nextInt();
                    switch (opcionMenu) {
                    case 1:
                        ciclar = false;
                        do {
                            MENU.operaciones();
                            try {
                                operacionSeleccionada = s.next();
                                final Operaciones operacion = Operaciones.valueOf(operacionSeleccionada.toUpperCase());
                                switch (operacion) {
                                case SUMA:
                                    break;
                                case DIVISION:
                                    break;
                                case RESTA:
                                    break;
                                case MULTIPLICACION:
                                    break;
                                default:
                                    System.out.println("Opción invalida-");
                                    ciclar = true;
                                    break;
                                }
                            } catch (final IllegalArgumentException | NullPointerException e) {
                                ciclar = true;
                                System.out.println("Opción invalida*");
                            }
                        } while (ciclar);
                        break;
                    case 2:
                        ciclar = false;
                        break;
                    case 3:
                        System.out.println("Adios........!!!");
                        ciclar = false;
                        break;
                    default:
                        System.err.println("Opción invalida");
                        ciclar = true;
                        break;
                    }
                } catch (final InputMismatchException e) {
                    System.err.println("Opción invalida");
                    ciclar = true;

                }

            } while (ciclar);
        } catch (final IllegalStateException e) {

        }
    }
}
