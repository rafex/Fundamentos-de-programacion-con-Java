package mx.rafex.cursos.fundamentos.app;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Hello world!
 *
 */
public class App {

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
                    default:
                        menuPrincipal = true;
                        JOptionPane.showMessageDialog(null, "Opción invalida", "Error", JOptionPane.ERROR_MESSAGE);
                        break;
                }
            } catch (final Exception e) {
                mensajeError(e.getMessage());
            }
        while (menuPrincipal);

        final String nom = JOptionPane.showInputDialog("Nombre:");
        mensaje(nom);

        try {
            if (escaner != null)
                escaner.close();
        } catch (final Exception e) {
            mensajeError(e.getMessage());
        }

    }

    public static void mensaje(final Object object) {
        System.out.println(object);
    }

    public static void mensajeError(final Object object) {
        System.err.println(object);
    }

}
