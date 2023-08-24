package test;

import datos.Conexion;
import datos.PersonaDAO;
import datos.UsuarioJDBC;
import domain.Persona;
import domain.Usuario;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ap
 */
public class TestManejoPersonas {
//CONCEPTO TRANSACCIONAL

    public static void main(String[] args) {
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }
            PersonaDAO personaDao = new PersonaDAO(conexion);
            Persona cambioPersona = new Persona(1, "Andres", "Vivas", "andresfpaz16@gmail.com", "3107806416");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona("Pipe", "Paz11111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111111", "apazvivas@gmail.com", "3107806416");
            personaDao.insertar(nuevaPersona);

            conexion.commit();
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }
}
