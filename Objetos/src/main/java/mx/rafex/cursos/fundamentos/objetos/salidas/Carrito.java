package mx.rafex.cursos.fundamentos.objetos.salidas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Carrito implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = -2125676412308603895L;

    private ArrayList<Producto> listaDeProductos;

    private BigDecimal precioSinIva;
    private BigDecimal precioConIva;
    private BigDecimal costoEnvio;
    private BigDecimal descuento;
    private Long id;
    private LocalDate fecha;
}
