package mx.rafex.cursos.fundamentos.dtos.productos;

import java.io.Serializable;

public class ProductoDto implements Serializable {

    private static final long serialVersionUID = 3091385373538650922L;

    private Long sku;
    private Double precio;
    private String marca;
    private Double costo;

    public Long getSku() {
        return sku;
    }

    public void setSku(final Long sku) {
        this.sku = sku;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(final Double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(final String marca) {
        this.marca = marca;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(final Double costo) {
        this.costo = costo;
    }

}
