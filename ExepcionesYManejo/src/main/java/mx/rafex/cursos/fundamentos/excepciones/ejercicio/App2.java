package mx.rafex.cursos.fundamentos.excepciones.ejercicio;

public class App2 {

    public static void main(final String[] args) {

        final String texto = "1";
        Integer resultado = 0;
        final Integer otroNumero = 3;
        final Integer numeroConvertido = Integer.valueOf(texto);
        resultado = otroNumero + numeroConvertido;

        if (numeroConvertido instanceof Integer) {
            System.out.println("Si es un Integer: " + numeroConvertido);
        } else {
            System.out.println("No es un Integer ");
        }

        System.out.println("El resultado es: " + resultado);

        final String nuevoResultado = String.valueOf(resultado);

        if (nuevoResultado instanceof String) {
            System.out.println("Si es un string: " + nuevoResultado);
        } else {
            System.out.println("No es un string ");
        }
    }
}
