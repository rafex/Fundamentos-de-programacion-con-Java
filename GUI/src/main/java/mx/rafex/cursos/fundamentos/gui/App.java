package mx.rafex.cursos.fundamentos.gui;

import java.awt.Button;
import java.awt.Frame;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(final String[] args) {

        final Frame f = new Frame("Mi Ventana");
        f.setBounds(500, 500, 400, 400);
        f.setLayout(null);
        final Button bt = new Button("Pulsar aquí");
        bt.setBounds(50, 50, 100, 30);
        f.add(bt);
        f.setVisible(true);

    }
}
