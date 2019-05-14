package mx.rafex.cursos.fundamentos.ejercicios;

import java.nio.charset.StandardCharsets;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class App {

    private final static Menu MENU = new Menu();

    public static void main(final String[] args) {

        int opcionMenu = 0;
        boolean ciclar = true;
        Scanner s = null;
        String operacionSeleccionada = null;

        try {
            do {
                MENU.inicial();
                try {
                    s = new Scanner(System.in, StandardCharsets.UTF_8.name());
                    opcionMenu = s.nextInt();
                    boolean ciclar2 = false;
                    switch (opcionMenu) {
                        case 1:
                            do {
                                MENU.operaciones();
                                try {
                                    operacionSeleccionada = s.next();
                                    final Operaciones tipoOperacion = Operaciones
                                            .valueOf(operacionSeleccionada.toUpperCase());
                                    final Operacion o = new Operacion();
                                    switch (tipoOperacion) {
                                        case SUMA:
                                        case DIVISION:
                                        case RESTA:
                                        case MULTIPLICACION:
                                        case M:
                                        case S:
                                        case R:
                                        case D:
                                            o.ejecutar(tipoOperacion);
                                            ciclar2 = false;
                                            break;
                                        default:
                                            System.err.println("Opción invalida-");
                                            ciclar2 = true;
                                            break;
                                    }
                                } catch (final IllegalArgumentException | NoSuchElementException
                                        | NullPointerException e) {
                                    ciclar2 = true;
                                    System.err.println("Opción invalida*");
                                }
                            } while (ciclar2);

                            ciclar = false;
                            break;
                        case 2:
                            new TablaCalculadora().mostrarResultados();
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
                } catch (final NoSuchElementException e) {
                    System.err.println("Opción invalida");
                    ciclar = true;
                }

            } while (ciclar);
        } catch (final IllegalStateException e) {

        }

        finally {
            if (s != null)
                try {
                    s.close();
                } catch (final IllegalStateException e) {

                }
        }
    }
}
