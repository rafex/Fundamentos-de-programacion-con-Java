package mx.rafex.cursos.fundamentos.objetos.productos;

public class Productos {
    private Double precio;
    private String tipo;
    private String marca;
    private Double costo;
    private Double peso;
    private Integer cantidad;

    public Double getPrecio() {
        return this.precio;
    }

    public void setPrecio(final Double precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(final String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return this.costo;
    }

    public void setCosto(final Double costo) {
        this.costo = costo;
    }

    public Double getPeso() {
        return this.peso;
    }

    public void setPeso(final Double peso) {
        this.peso = peso;
    }

    public Integer getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(final Integer cantidad) {
        this.cantidad = cantidad;
    }

}
