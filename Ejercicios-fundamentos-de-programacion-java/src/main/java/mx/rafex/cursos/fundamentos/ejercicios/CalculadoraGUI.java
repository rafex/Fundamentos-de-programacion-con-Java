package mx.rafex.cursos.fundamentos.ejercicios;

import java.awt.Container;
import java.awt.EventQueue;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraGUI {

    private JFrame frame;
    private JTextField textField;
    private JPanel panel;
    private JPanel panel2;
    private Container container;
    private Double numberOne;
    private Double numberTwo;
    private Double result;
    private Operaciones operation;
    private Calculadora calculator;

    /**
     * Launch the application.
     */
    public static void main(final String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                final CalculadoraGUI window = new CalculadoraGUI();
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
    public CalculadoraGUI() {
        this.initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        this.frame = new JFrame("Ejercicio calculadora");
        this.container = this.frame.getContentPane();
        this.container.setLayout(null);
        this.frame.setBounds(100, 100, 440, 340);
        this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.panel = new JPanel(null);
        this.panel.setBounds(5, 25, 430, 290);
        this.panel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Calculadora"));
//        this.panel.setBackground(Color.gray);
        this.container.add(this.panel);
        this.panel.setVisible(false);

        this.panel2 = new JPanel(null);
        this.panel2.setBounds(5, 25, 430, 290);
        this.panel2.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Historial"));
//        this.panel.setBackground(Color.gray);
        this.container.add(this.panel2);
        this.panel2.setVisible(false);

        this.textField = new JTextField();
        this.textField.setEditable(false);
        this.textField.setBounds(10, 20, 411, 30);
        this.textField.setHorizontalAlignment(JTextField.RIGHT);
        this.panel.add(this.textField);

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

        final JButton buttonSubtraction = new JButton("-");
        buttonSubtraction.setBounds(325, 140, 100, 30);
        this.panel.add(buttonSubtraction);

        final JButton buttonZero = new JButton("0");
        buttonZero.setBounds(115, 180, 100, 30);
        this.panel.add(buttonZero);

        final JButton buttonPoint = new JButton(".");
        buttonPoint.setBounds(220, 180, 100, 30);
        this.panel.add(buttonPoint);

        final JButton buttonSum = new JButton("+");
        buttonSum.setBounds(325, 180, 100, 30);
        this.panel.add(buttonSum);

        final JButton buttonClear = new JButton("Limpiar");
        buttonClear.setBounds(220, 220, 100, 30);
        this.panel.add(buttonClear);

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

        this.numberOne(buttonSum);
        this.numberOne(buttonMultiplication);
        this.numberOne(buttonDivision);
        this.numberOne(buttonSubtraction);

        this.numberTwo(buttonEquals);

        final JMenuBar menuBar = new JMenuBar();
        menuBar.setBounds(0, 0, 440, 22);
        this.container.add(menuBar);

        final JMenu menuOptions = new JMenu("Opciones..");

        final JMenuItem itemCalculator = new JMenuItem("Calculadora");
        final JMenuItem itemHistory = new JMenuItem("Historial");
        final JMenuItem itemExit = new JMenuItem("Salir...");
        menuOptions.add(itemCalculator);
        menuOptions.add(itemHistory);
        menuOptions.add(itemExit);

        menuBar.add(menuOptions);

        itemCalculator.addActionListener(e -> {
            this.panel.setVisible(true);
            this.panel2.setVisible(false);
        });
        itemHistory.addActionListener(e -> {

            this.panel2.setVisible(true);
            this.panel.setVisible(false);

        });
        itemExit.addActionListener(e -> System.exit(0));

        buttonClear.addActionListener(e -> {
            this.textField.setText("");
            this.result = 0.0;
            this.numberOne = 0.0;
            this.numberTwo = 0.0;
        });

    }

    private void action(final JButton button) {
        button.addActionListener(e -> {
            final String tmp = this.textField.getText();
            this.textField.setText(tmp.concat(button.getText().trim()));
        });
    }

    private void numberOne(final JButton button) {
        button.addActionListener(e -> {
            final String operation = button.getText();

            switch (operation) {
            case "+":
                this.operation = Operaciones.SUMA;
                break;
            case "-":
                this.operation = Operaciones.RESTA;
                break;
            case "/":
                this.operation = Operaciones.DIVISION;
                break;
            case "*":
                this.operation = Operaciones.MULTIPLICACION;
                break;
            }

            this.numberOne = Double.parseDouble(this.textField.getText());
            System.out.println("Valor de número uno: " + this.numberOne);
            System.out.println("Operación: " + this.operation);
            this.textField.setText("");
        });

    }

    @SuppressWarnings("incomplete-switch")
    private void numberTwo(final JButton button) {

        button.addActionListener(e -> {
            this.numberTwo = Double.parseDouble(this.textField.getText());
            System.out.println("Valor de número dos: " + this.numberTwo);
            this.calculator = new Calculadora();
            switch (this.operation) {
            case SUMA:
                this.result = this.calculator.suma(this.numberOne, this.numberTwo);
                break;
            case RESTA:
                this.result = this.calculator.resta(this.numberOne, this.numberTwo);
                break;
            case DIVISION:
                this.result = this.calculator.division(this.numberOne, this.numberTwo);
                break;
            case MULTIPLICACION:
                this.result = this.calculator.multiplicacion(this.numberOne, this.numberTwo);
                break;

            }
            System.out.println("Valor de resultado: " + this.result);
            this.textField.setText(this.result.toString());
            new TablaCalculadora().insertarResultado(this.operation, this.numberOne, this.numberTwo, this.result);
        });

    }
}
