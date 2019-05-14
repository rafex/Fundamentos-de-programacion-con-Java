package mx.rafex.cursos.fundamentos.gui;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JTextArea;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(final String[] args) {

        final Frame f = new Frame("Mi Ventana nueva");
        f.setBounds(800, 800, 1024, 800);
        f.setLayout(null);
        final JTextArea textArea = new JTextArea();
        textArea.setBounds(50, 50, 100, 30);
        final JButton bt = new JButton("Pulsar aquí");
        bt.setBounds(70, 70, 100, 30);
        f.add(textArea);
        f.add(bt);

        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent we) {
                System.exit(0);
            }
        });

        f.setVisible(true);

    }
}
