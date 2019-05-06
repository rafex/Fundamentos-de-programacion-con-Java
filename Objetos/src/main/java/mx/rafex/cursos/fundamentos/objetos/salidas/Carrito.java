package mx.rafex.cursos.fundamentos.objetos.salidas;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import mx.rafex.cursos.fundamentos.objetos.productos.Producto;

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

    public ArrayList<Producto> getListaDeProductos() {
        return this.listaDeProductos;
    }

    public void setListaDeProductos(final ArrayList<Producto> listaDeProductos) {
        this.listaDeProductos = listaDeProductos;
    }

    public BigDecimal getPrecioSinIva() {
        return this.precioSinIva;
    }

    public void setPrecioSinIva(final BigDecimal precioSinIva) {
        this.precioSinIva = precioSinIva;
    }

    public BigDecimal getPrecioConIva() {
        return this.precioConIva;
    }

    public void setPrecioConIva(final BigDecimal precioConIva) {
        this.precioConIva = precioConIva;
    }

    public BigDecimal getCostoEnvio() {
        return this.costoEnvio;
    }

    public void setCostoEnvio(final BigDecimal costoEnvio) {
        this.costoEnvio = costoEnvio;
    }

    public BigDecimal getDescuento() {
        return this.descuento;
    }

    public void setDescuento(final BigDecimal descuento) {
        this.descuento = descuento;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return this.fecha;
    }

    public void setFecha(final LocalDate fecha) {
        this.fecha = fecha;
    }
}
