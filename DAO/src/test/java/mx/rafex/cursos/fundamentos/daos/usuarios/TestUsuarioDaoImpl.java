package mx.rafex.cursos.fundamentos.daos.usuarios;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import mx.rafex.cursos.fundamentos.dtos.usuarios.UsuarioDto;

class TestUsuarioDaoImpl {

    UsuarioDao usuarioDao = new UsuarioDaoImpl();

    @DisplayName("Prueba de insertar un nuevo usuario a la tabla")
    @Test
    void pruebaInsercionUsuario() {

        final UsuarioDto usuario = new UsuarioDto();
        usuario.setAlias("Israel");
        usuario.setCorreoElectronico("israel.dev@gmail.com");
        usuario.setContrasenya("12345");
        final UsuarioDto resultado = this.usuarioDao.crear(usuario);

        assertNotNull(resultado, "fallo");
        assertNotNull(resultado.getId(), "fallo");

        System.out.println("Id: " + resultado.getId());
        System.out.println("Alias: " + resultado.getAlias());
    }

}
