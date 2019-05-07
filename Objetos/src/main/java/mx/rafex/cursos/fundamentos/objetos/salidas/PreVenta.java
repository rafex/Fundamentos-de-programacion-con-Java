package mx.rafex.cursos.fundamentos.objetos.salidas;

import java.io.Serializable;

import mx.rafex.cursos.fundamentos.objetos.usuarios.Usuario;

public class PreVenta implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2734437111481046939L;

    Usuario cliente;
    Carrito carrito;
    Integer id;

}
