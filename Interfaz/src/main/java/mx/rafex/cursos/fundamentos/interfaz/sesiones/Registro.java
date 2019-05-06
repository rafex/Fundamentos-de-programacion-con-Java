package mx.rafex.cursos.fundamentos.interfaz.sesiones;

import mx.rafex.cursos.fundamentos.objetos.personas.Persona;
import mx.rafex.cursos.fundamentos.objetos.usuarios.Usuario;

public class Registro {

    private Persona persona;
    private Usuario usuario;

    public Boolean registra(Persona persona, Usuario usuario) {
        this.persona = persona;
        this.usuario = usuario;

        if (ORM.registroUsuarios())
            return true;

        return false;
    }

}
