package mx.rafex.cursos.fundamentos.interfaz.sesiones;

import mx.rafex.cursos.fundamentos.objetos.usuarios.Usuario;

public class Sesion {

    public Boolean iniciarSesion(Usuario usuario) {

        if (ORM.obtenerUsuario(usuario))
            return true;

        return false;
    }
}
