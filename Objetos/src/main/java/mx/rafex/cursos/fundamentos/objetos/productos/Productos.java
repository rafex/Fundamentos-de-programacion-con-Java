package mx.rafex.cursos.fundamentos.objetos.productos;

public class Productos {
    private Double precio;
    private String tipo;
    private String departamento;

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

    public String getDepartamento() {
        return this.departamento;
    }

    public void setDepartamento(final String departamento) {
        this.departamento = departamento;
    }

}
