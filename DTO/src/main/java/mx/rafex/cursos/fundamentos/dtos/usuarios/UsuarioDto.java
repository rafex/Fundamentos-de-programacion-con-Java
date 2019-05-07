package mx.rafex.cursos.fundamentos.dtos.usuarios;

import java.io.Serializable;

public class UsuarioDto implements Serializable {

    private static final long serialVersionUID = 3364567805348216085L;

    private Integer id;
    private String alias;
    private String contrasenya;
    private String correoElectronico;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(final String alias) {
        this.alias = alias;
    }

    public String getContrasenya() {
        return contrasenya;
    }

    public void setContrasenya(final String contrasenya) {
        this.contrasenya = contrasenya;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(final String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
