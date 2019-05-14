package mx.rafex.cursos.fundamentos.objetos.interfaces.personas;

import java.time.LocalDate;

public interface Persona {

    Boolean ES_ESTA_VIVA = true;

    Integer calcularEdad(LocalDate fechaDeNacimiento);

    default void buenosDias() {
        System.out.println("Buenos días!!!");
    }

}
