package mx.rafex.cursos.fundamentos.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionBoton implements ActionListener {

    VentanaClase2 frame;

    public GestionBoton(final VentanaClase2 f) {
        frame = f;
    }

    @Override
    public void actionPerformed(final ActionEvent e) {
        final String texto = frame.getTf().getText();
        frame.getLbl().setText(texto);
    }

}
