package mx.rafex.cursos.fundamentos.gui;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test {

    private JFrame frame;
    private JTextField textField;

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
        this.initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        this.frame = new JFrame();
        this.frame.setLayout(null);
        this.frame.setBounds(100, 100, 450, 300);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.textField = new JTextField();
        this.textField.setBounds(10, 20, 430, 30);
        this.frame.getContentPane().add(this.textField);
        this.textField.setColumns(10);

        final JButton btnNewButton = new JButton("7");
        btnNewButton.setBounds(10, 60, 100, 30);
        this.frame.getContentPane().add(btnNewButton);

        final JButton btnNewButton_1 = new JButton("8");
        btnNewButton_1.setBounds(115, 60, 100, 30);
        this.frame.getContentPane().add(btnNewButton_1);

        final JButton btnNewButton_2 = new JButton("9");
        btnNewButton_2.setBounds(220, 60, 100, 30);
        this.frame.getContentPane().add(btnNewButton_2);

        final JButton btnNewButton_3 = new JButton("/");
        btnNewButton_3.setBounds(325, 60, 100, 30);
        this.frame.getContentPane().add(btnNewButton_3);
    }

}
