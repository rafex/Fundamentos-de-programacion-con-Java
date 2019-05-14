package mx.rafex.cursos.fundamentos.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaClase1 {

    public static void main(final String[] args) {

        final Frame f = new Frame("Mi Ventana");
        f.setBounds(500, 500, 400, 400);
        f.setLayout(null);
        final Button bt = new Button("Pulsar aquí");
        bt.setBounds(50, 50, 100, 30);
        f.add(bt);
        f.setVisible(true);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                System.out.println("Cerrando...");
                final Frame f = (Frame) e.getSource();
                f.dispose();
            }
        });

    }
}
