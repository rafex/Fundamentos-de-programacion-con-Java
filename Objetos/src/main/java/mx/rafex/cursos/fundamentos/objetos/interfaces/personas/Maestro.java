package mx.rafex.cursos.fundamentos.objetos.interfaces.personas;

import java.time.LocalDate;
import java.time.Period;

public class Maestro implements Persona {

    @Override
    public Integer calcularEdad(final LocalDate fechaDeNacimiento) {
        final LocalDate ahora = LocalDate.now();
        final Period periodo = Period.between(fechaDeNacimiento, ahora);
        return periodo.getYears();
    }

}
