package mx.rafex.cursos.fundamentos.basededatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class TestBD {

    public static void main(final String[] args) {

        final Conexion c = new Conexion();

        final Connection connection = c.conectarBaseDeDatos();

        final String nombreTabla = "Cervezas";
        final String querySQLInsert = "INSERT INTO public.\"" + nombreTabla
                + "\" (nombre,marca,alcohol) VALUES (?,?,?);";
        final String querySQLSelect = "SELECT * FROM public.\"" + nombreTabla + "\";";

        try {
            PreparedStatement ps = null;
            ps = connection.prepareStatement(querySQLInsert);
            ps.setString(1, "MiCerveza");
            ps.setString(2, "MiEmpresa");
            ps.setDouble(3, 7.0);

            final int executeUpdate = ps.executeUpdate();

            if (executeUpdate == 1) {
                System.out.println("Inserto correctamente: ");
                System.out.println(querySQLInsert);
            } else if (executeUpdate == 2) {
                System.err.println("Fallo!!! ");
                System.err.println(querySQLInsert);
            }

            ps = connection.prepareStatement(querySQLSelect);
            final ResultSet rs = ps.executeQuery();
            final ResultSetMetaData rsmd = rs.getMetaData();
            System.out.print("||");
            System.out.print(rsmd.getColumnName(1));
            System.out.print("||");
            System.out.print(rsmd.getColumnName(2));
            System.out.print("||");
            System.out.print(rsmd.getColumnName(3));
            System.out.print("||");
            System.out.print(rsmd.getColumnName(4));
            System.out.print("||");
            System.out.println();
            while (rs.next()) {
                System.out.print("||");
                System.out.print(rs.getInt("id"));
                System.out.print("||");
                System.out.print(rs.getString("nombre"));
                System.out.print("||");
                System.out.print(rs.getString("marca"));
                System.out.print("||");
                System.out.print(rs.getDouble("alcohol"));
                System.out.print("||");
                System.out.println();

            }

        } catch (final SQLException e) {
            e.printStackTrace();
        }

    }

}
