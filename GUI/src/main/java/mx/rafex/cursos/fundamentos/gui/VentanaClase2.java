package mx.rafex.cursos.fundamentos.gui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class VentanaClase2 extends Frame {

    private static final long serialVersionUID = 2797942237867343966L;

    private Button bt;
    private TextField tf;
    private Label lbl;

    public VentanaClase2(final String titulo) {
        super(titulo);
        init();
    }

    private void init() {

        setBounds(30, 80, 400, 250);
        final FlowLayout layout = new FlowLayout(FlowLayout.CENTER);
        setLayout(layout);
        bt = new Button("Mostrar texto");
        bt.setBounds(150, 200, 120, 30);
        tf = new TextField();
        tf.setBounds(150, 70, 100, 30);
        lbl = new Label("...........................");
        lbl.setBounds(150, 130, 100, 30);

        bt.addActionListener(e -> {
            final String texto = getTf().getText();
            getLbl().setText(texto);
        });
        add(bt);
        add(tf);
        add(lbl);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(final WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);

    }

    /**
     * @return the bt
     */
    public Button getBt() {
        return bt;
    }

    /**
     * @return the tf
     */
    public TextField getTf() {
        return tf;
    }

    /**
     * @return the lbl
     */
    public Label getLbl() {
        return lbl;
    }

}
