package mx.rafex.cursos.fundamentos.ejercicios;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TablaCalculadora {

    private final Conexion C = new Conexion();
    private final String NOMBRE_TALBA = "calculadora";
    private final String NOMBRE_ALUMNO = "Imanol";
    private final String QUERY_SQL_INSERT = "INSERT INTO public.\"" + this.NOMBRE_TALBA
            + "\" (operacion,numero1,numero2,resultado,fecha,alumno) VALUES (?,?,?,?,?,?);";
    private final String QUERY_SQL_SELECT = "SELECT * FROM public.\"" + this.NOMBRE_TALBA + "\" WHERE alumno = '"
            + this.NOMBRE_ALUMNO + "';";

    private final String NOMBRE_COLUMNA_OPERACION = "operacion";
    private final String NOMBRE_COLUMNA_NUMERO1 = "numero1";
    private final String NOMBRE_COLUMNA_NUMERO2 = "numero2";
    private final String NOMBRE_COLUMNA_RESULTADO = "resultado";
    private final String NOMBRE_COLUMNA_FECHA = "fecha";

    public void insertarResultado(final Operaciones operacion, final double a, final double b, final double c) {
        final Date fechaActua = new Date(System.currentTimeMillis());
        PreparedStatement ps = null;
        Connection conexion = null;
        try {
            conexion = this.C.conectarBaseDeDatos();
            ps = conexion.prepareStatement(this.QUERY_SQL_INSERT);
            ps.setString(1, operacion.getNombreOperacion());
            ps.setDouble(2, a);
            ps.setDouble(3, b);
            ps.setDouble(4, c);
            ps.setDate(5, fechaActua);
            ps.setString(6, this.NOMBRE_ALUMNO);

            final int executeUpdate = ps.executeUpdate();

            if (executeUpdate == 1) {
                System.out.println("Inserto correctamente: ");
                System.out.println(this.QUERY_SQL_INSERT);
            } else if (executeUpdate == 2) {
                System.err.println("Fallo!!! ");
                System.err.println(this.QUERY_SQL_INSERT);
            }

        } catch (final SQLException e) {
            e.printStackTrace();
            System.err.println("Fallo!!! ");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
            } catch (final SQLException e) {
            }
        }

    }

    public void mostrarResultados() {
        PreparedStatement ps = null;
        Connection conexion = null;
        ResultSet rs = null;
        try {
            conexion = this.C.conectarBaseDeDatos();
            ps = conexion.prepareStatement(this.QUERY_SQL_SELECT);

            rs = ps.executeQuery();

            int numeroDeOperaciones = 0;

            while (rs.next()) {

                System.out.println();
                System.out.println("-------------------------------------------------------");
                System.out.println("Operación: " + rs.getString(this.NOMBRE_COLUMNA_OPERACION));
                System.out.println("Número uno: " + rs.getDouble(this.NOMBRE_COLUMNA_NUMERO1));
                System.out.println("Número dos: " + rs.getDouble(this.NOMBRE_COLUMNA_NUMERO2));
                System.out.println("Resultado: " + rs.getDouble(this.NOMBRE_COLUMNA_RESULTADO));
                System.out.println("Fecha: " + rs.getDate(this.NOMBRE_COLUMNA_FECHA));
                System.out.println("-------------------------------------------------------");
                System.out.println();
                numeroDeOperaciones++;

            }

            System.out.println("Número total de operaciones: " + numeroDeOperaciones);

        } catch (final SQLException e) {
            e.printStackTrace();
            System.err.println("Fallo!!! ");
        }

        finally {
            try {
                if (ps != null) {
                    ps.close();
                }
                if (conexion != null) {
                    conexion.close();
                }
                if (rs != null) {
                    rs.close();
                }
            } catch (final SQLException e) {
            }
        }
    }

}
