package mx.rafex.cursos.fundamentos.dtos.personas;

import java.io.Serializable;

public class PersonaDto implements Serializable {

    private static final long serialVersionUID = -8658084977016700942L;

    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(final String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(final String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(final String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

}
