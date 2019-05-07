package mx.rafex.cursos.fundamentos.daos.usuarios;

import mx.rafex.cursos.fundamentos.dtos.usuarios.UsuarioDto;

public interface UsuarioDao {

    UsuarioDto buscar(UsuarioDto usuario);

    UsuarioDto crear(UsuarioDto usuario);

}
