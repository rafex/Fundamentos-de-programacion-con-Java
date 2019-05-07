package mx.rafex.cursos.fundamentos.daos.usuarios;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mx.rafex.cursos.fundamentos.daos.conexion.Sqlite;
import mx.rafex.cursos.fundamentos.dtos.usuarios.UsuarioDto;

public class UsuarioDaoImpl implements UsuarioDao {

    private final String INSERT_USUARIO = "INSERT INTO usuarios (alias,contrasenya,correoElectronico) VALUES "
            + "('{alias}','{contrasenya}','{correoElectronico}')";

    private final String SELECT_USUARIO = "SELECT * FROM usuarios WHERE id=?";

    @Override
    public UsuarioDto buscar(final UsuarioDto usuario) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public UsuarioDto crear(final UsuarioDto usuario) {
        UsuarioDto resultado = null;
        final String consulta = INSERT_USUARIO.replace("{alias}", usuario.getAlias())
                .replace("{correoElectronico}", usuario.getCorreoElectronico())
                .replace("{contrasenya}", hashMe(usuario.getContrasenya()));
        Statement sentencia = null;
        try {
            sentencia = Sqlite.conexion.createStatement();

            final int executeUpdate = sentencia.executeUpdate(consulta);

            if (executeUpdate == 1) {
                final String query = "SELECT MAX(id) AS LAST FROM usuarios";
                PreparedStatement pst1 = Sqlite.conexion.prepareStatement(query);
                ResultSet rs1 = pst1.executeQuery();
                final Integer maxId = rs1.getInt("LAST");
                System.out.println("id:" + maxId);
                pst1 = Sqlite.conexion.prepareStatement(SELECT_USUARIO);
                pst1.setInt(1, maxId);
                rs1 = pst1.executeQuery();
                if (rs1 != null) {
                    resultado = new UsuarioDto();
                    resultado.setAlias(rs1.getString("alias"));
                    resultado.setCorreoElectronico(rs1.getString("correoElectronico"));
                    resultado.setId(rs1.getInt("id"));
                }
            } else if (executeUpdate == 2) {

            }

            System.out.println("Se ejecuto la consulta correctamente");

            sentencia.close();

        } catch (final SQLException e) {
            System.err.println("Hubo un error al ejecutar la consulta: " + consulta);
            System.err.println(e.getMessage());
        } finally {
            try {
                if (sentencia != null)
                    sentencia.close();
            } catch (final SQLException ex) {
                System.err.println("Error al cerrar la sentencia");
                System.err.println(ex.getMessage());
            }
        }
        return resultado;
    }

    private UsuarioDto ejecutarConsulta(final UsuarioDto usuario) {
        final UsuarioDto resultado = null;

        final String consulta = SELECT_USUARIO.replace("{id}", String.valueOf(usuario.getId()));

        try (Statement sentencia = Sqlite.conexion.createStatement()) {

            ResultSet resultSet = null;
            resultSet = sentencia.executeQuery(consulta);

            if (resultSet != null) {
                System.out.println("Se ejecuto la consulta correctamente");

                while (resultSet.next())
                    System.out.println(resultSet.getString("correoElectronico"));

                sentencia.close();
                resultSet.close();

            } else
                System.err.println("Fallo la consulta");

        } catch (final SQLException e) {
            System.err.println("Hubo un error al ejecutar la consulta: ");
            System.err.println(e.getMessage());
        }

        return resultado;
    }

    private String hashMe(String password) {

        try {
            final MessageDigest md = MessageDigest.getInstance("SHA-1");
            md.reset();
            md.update(password.getBytes("UTF-8"));
            final byte[] resultByte = md.digest();
            password = String.format("%01x", new java.math.BigInteger(1, resultByte));

        } catch (final NoSuchAlgorithmException e) {
            // do something.
        } catch (final UnsupportedEncodingException ex) {
            // do something
        }
        return password;
    }

}
