package mx.rafex.cursos.fundamentos.objetos.interfaces.personas;

import java.time.LocalDate;

public class App {

    public static void main(final String[] args) {

        final Alumno p = new Alumno();
        LocalDate fechaDeNacimiento = LocalDate.of(1992, 05, 31);
        mostrar(p, fechaDeNacimiento);

        final Maestro m = new Maestro();
        fechaDeNacimiento = LocalDate.of(1988, 11, 03);
        mostrar(m, fechaDeNacimiento);

        p.buenosDias();
        m.buenosDias();

    }

    public static void mostrar(final Persona objeto, final LocalDate fechaDeNacimiento) {

        final Integer edad = objeto.calcularEdad(fechaDeNacimiento);

        System.out.println("Tu edad es: " + edad);

    }

}
