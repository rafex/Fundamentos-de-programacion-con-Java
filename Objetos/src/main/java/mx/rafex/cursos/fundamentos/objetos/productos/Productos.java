package mx.rafex.cursos.fundamentos.objetos.productos;

public class Productos {
    private Double precio;
    private String tipo;
    private String marca;
    private Double costo;

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
