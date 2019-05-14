package mx.rafex.cursos.fundamentos.objetos.interfaces.personas;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.Period;

public class Alumno implements Persona, Serializable {

    private static final long serialVersionUID = -4058680786226467763L;

    @Override
    public Integer calcularEdad(final LocalDate fechaDeNacimiento) {
        final LocalDate ahora = LocalDate.now();
        final Period periodo = Period.between(fechaDeNacimiento, ahora);
        return periodo.getYears();
    }

    @Override
    public void buenosDias() {
        System.out.println("Cuales buenso días, es bien temprano");
    }

}
