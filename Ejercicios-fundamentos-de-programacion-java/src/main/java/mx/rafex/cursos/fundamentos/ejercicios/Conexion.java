package mx.rafex.cursos.fundamentos.ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private final String CLASS_NAME = "org.postgresql.Driver";
    private final String URL = "jdbc:postgresql://ec2-50-19-127-115.compute-1.amazonaws.com:5432/dcsd99u9hi6pbk";
    private final String USUARIO = "rmoksuyuzefzvp";
    private final String CONSTRSENYA = "fe59804f36b943d7aaecb75f3d75bdd6d8279efb8ffbd6945591da291029a704";

    private Connection conexion;

    public Connection conectarBaseDeDatos() {
        try {
            Class.forName(CLASS_NAME);
            conexion = DriverManager.getConnection(URL, USUARIO, CONSTRSENYA);
            System.out.println("Se ha conectado a la base correctamente");
        } catch (final SQLException | ClassNotFoundException e) {
            System.err.println("No se ha podido conectar a la base de datos");
            System.err.println(e.getMessage());
        }

        return conexion;

    }

    public void cerrarConexion() {
        try {
            if (conexion != null)
                conexion.close();
        } catch (final SQLException ex) {
            System.err.println("Error al cerrar la conexion");
            System.err.println(ex.getMessage());
        }
    }

}
