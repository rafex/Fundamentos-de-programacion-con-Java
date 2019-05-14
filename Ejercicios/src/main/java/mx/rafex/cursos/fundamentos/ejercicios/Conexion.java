package mx.rafex.cursos.fundamentos.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private Connection conexion;

    public Connection conectarBaseDeDatos() {
        try {
            Class.forName("org.postgresql.Driver");
            final String url = "jdbc:postgresql://ec2-50-19-127-115.compute-1.amazonaws.com:5432/dcsd99u9hi6pbk";
            this.conexion = DriverManager.getConnection(url, "rmoksuyuzefzvp",
                    "fe59804f36b943d7aaecb75f3d75bdd6d8279efb8ffbd6945591da291029a704");

            System.out.println("Se ha conectado a la base correctamente");
        } catch (final SQLException | ClassNotFoundException e) {
            System.err.println("No se ha podido conectar a la base de datos");
            System.err.println(e.getMessage());
        }

        return this.conexion;

    }

    public void cerrarConexion() {
        try {
            if (this.conexion != null) {
                this.conexion.close();
            }
        } catch (final SQLException ex) {
            System.err.println("Error al cerrar la conexion");
            System.err.println(ex.getMessage());
        }
    }

}
