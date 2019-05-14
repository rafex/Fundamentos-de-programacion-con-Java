package mx.rafex.cursos.fundamentos.ejercicios;

public enum Operaciones {

    SUMA("suma"), RESTA("resta"), DIVISION("division"), MULTIPLICACION("multiplicacion"), S("suma"), R("resta"),
    D("division"), M("multiplicacion");

    private final String nombreOperacion;

    Operaciones(final String nombreOperacion) {
        this.nombreOperacion = nombreOperacion;
    }

    public String getNombreOperacion() {
        return nombreOperacion.toUpperCase();
    }

}
