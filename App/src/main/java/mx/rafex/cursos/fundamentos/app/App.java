package mx.rafex.cursos.fundamentos.app;

import java.util.Scanner;

import mx.rafex.cursos.fundamentos.daos.conexion.Sqlite;

/**
 * Hello world!
 *
 */
public class App extends Thread {

    public static void main(final String[] args) {

        mensaje("Bienvenidos al sistema básico de Fundamentos de programación con Java");

        int opcion = 0;

        boolean menuPrincipal = true;

        Scanner escaner = null;
        do
            try {
                mensaje("*****************************************");
                mensaje("************* Opciones ******************");
                mensaje("*****************************************");
                mensaje("");
                mensaje("1) Iniciar sesión");
                mensaje("2) Registrar");
                mensaje("3) Salir");
                mensaje("");
                mensaje("*****************************************");
                mensaje("*****************************************");

                escaner = new Scanner(System.in);
                opcion = escaner.nextInt();
                switch (opcion) {
                    case 1:
                        menuPrincipal = false;
                        break;
                    case 2:
                        menuPrincipal = false;
                        break;
                    case 3:
                        System.exit(0);
                        break;
                    default:
                        mensajeError("Opción invalida");
                        sleep(500);
                        menuPrincipal = true;
                        break;
                }
            } catch (final Exception e) {
                mensajeError(e.getMessage());
            }
        while (menuPrincipal);

        try {
            if (escaner != null)
                escaner.close();
        } catch (final Exception e) {
            mensajeError(e.getMessage());
        }

        Sqlite.cerrarConexion();
    }

    public static void mensaje(final Object object) {
        System.out.println(object);
    }

    public static void mensajeError(final Object object) {
        System.err.println(object);
    }

}
