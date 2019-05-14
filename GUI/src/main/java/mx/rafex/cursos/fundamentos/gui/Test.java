package mx.rafex.cursos.fundamentos.gui;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Test {

    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    private Container container;
    private Double numberOne;
    private Double numberTwo;

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
        this.frame = new JFrame("Ejercicio calculadora");
        this.container = this.frame.getContentPane();
        this.container.setLayout(null);
        this.frame.setBounds(100, 100, 440, 315);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel(null);
        this.panel.setBounds(5, 0, 430, 290);
        this.panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Calculadora"));
//        this.panel.setBackground(Color.gray);
        this.container.add(this.panel);
        this.panel.setVisible(true);

        this.textField = new JTextField();
        this.textField.setEditable(false);
        this.textField.setBounds(10, 20, 411, 30);
        this.panel.add(this.textField);
        this.textField.setColumns(10);

        final JButton buttonSeven = new JButton("7");
        buttonSeven.setBounds(10, 60, 100, 30);
        this.panel.add(buttonSeven);
        buttonSeven.setVisible(true);

        final JButton buttonEight = new JButton("8");
        buttonEight.setBounds(115, 60, 100, 30);
        this.panel.add(buttonEight);

        final JButton buttonNine = new JButton("9");
        buttonNine.setBounds(220, 60, 100, 30);
        this.panel.add(buttonNine);

        final JButton buttonDivision = new JButton("/");
        buttonDivision.setBounds(325, 60, 100, 30);
        this.panel.add(buttonDivision);

        final JButton buttonFour = new JButton("4");
        buttonFour.setBounds(10, 100, 100, 30);
        this.panel.add(buttonFour);

        final JButton buttonFive = new JButton("5");
        buttonFive.setBounds(115, 100, 100, 30);
        this.panel.add(buttonFive);

        final JButton buttonSix = new JButton("6");
        buttonSix.setBounds(220, 100, 100, 30);
        this.panel.add(buttonSix);

        final JButton buttonMultiplication = new JButton("*");
        buttonMultiplication.setBounds(325, 100, 100, 30);
        this.panel.add(buttonMultiplication);

        final JButton buttonOne = new JButton("1");
        buttonOne.setBounds(10, 140, 100, 30);
        this.panel.add(buttonOne);

        final JButton buttonTwo = new JButton("2");
        buttonTwo.setBounds(115, 140, 100, 30);
        this.panel.add(buttonTwo);

        final JButton buttonThree = new JButton("3");
        buttonThree.setBounds(220, 140, 100, 30);
        this.panel.add(buttonThree);

        final JButton botonSubtraction = new JButton("-");
        botonSubtraction.setBounds(325, 140, 100, 30);
        this.panel.add(botonSubtraction);

        final JButton buttonZero = new JButton("0");
        buttonZero.setBounds(115, 180, 100, 30);
        this.panel.add(buttonZero);

        final JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(220, 180, 100, 30);
        this.panel.add(buttonPoint);

        final JButton buttonSum = new JButton("+");
        buttonSum.setBounds(325, 180, 100, 30);
        this.panel.add(buttonSum);

        final JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(325, 220, 100, 30);
        this.panel.add(buttonEquals);

        this.action(buttonOne);
        this.action(buttonTwo);
        this.action(buttonThree);
        this.action(buttonFour);
        this.action(buttonFive);
        this.action(buttonSix);
        this.action(buttonSeven);
        this.action(buttonEight);
        this.action(buttonNine);
        this.action(buttonZero);
        this.action(buttonPoint);

    }

    private void action(final JButton button) {
        button.addActionListener(e -> {
            final String tmp = this.textField.getText();
            this.textField.setText(tmp.concat(button.getText().trim()));
        });
    }

    private void operation(final JButton button) {

    }

}
