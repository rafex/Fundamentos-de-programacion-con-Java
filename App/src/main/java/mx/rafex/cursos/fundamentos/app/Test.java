package mx.rafex.cursos.fundamentos.app;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Test {

    private Frame frame;
    /**
     * @wbp.nonvisual location=153,131
     */
    private final Panel panel = new Panel();

    /**
     * Launch the application.
     */
    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                final Test window = new Test();
                window.frame.setVisible(true);
            } catch (final Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     *
     * @wbp.parser.entryPoint
     */
    public Test() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        frame = new Frame();
        frame.setBounds(100, 100, 450, 300);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent evt) {
                exitForm(evt);
            }
        });
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void exitForm(final WindowEvent evt) {
        System.out.print("Saliendo...");
        System.exit(0);
    }

}
