package test;

import datos.PersonaDAO;
import datos.UsuarioJDBC;
import domain.Persona;
import domain.Usuario;
import java.util.List;

/**
 *
 * @author ap
 */
public class TestManejoPersonas {

    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        UsuarioJDBC usuarioDao = new UsuarioJDBC();
//        List<Persona> personas = personaDao.seleccionar();
//        for(Usuario persona: personas){
//            System.out.println("persona = " + persona);
//        }
//        Usuario personaNueva = new Usuario("Martha", "Vivas", "marcevas98@gmail.com", "3135348497");
//        personaDao.insertar(personaNueva);
//    Usuario personaUpdate = new Usuario(1, "Andres", "Vivas", "andres.paz01@unicatolica.edu.co", "3107806416");
//    personaDao.actualizar(personaUpdate);
//        Persona personaDelete = new Persona(1);
//        personaDao.eliminar(personaDelete);

        List<Persona> personas = personaDao.seleccionar();
        personas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });
//MANEJO DE USUARIOS
//INSERTAR USUARIOS DE LA TABLA usuario
//        Usuario usuarioNuevo = new Usuario("PipeV", "1601");
//        usuarioDao.insertar(usuarioNuevo);
//ACTUALIZAR USUARIO DE LA TABLA usuario
//        Usuario usuarioUpdate = new Usuario(1,"AndV", "1234");
//        usuarioDao.actualizar(usuarioUpdate);
//ELIMINAR USUARIO DE LA TABLA usuario
//        Usuario usuarioDelete = new Usuario(1);
//        usuarioDao.eliminar(usuarioDelete);

//LISTAR TODOS LOS USUARIOS DE LA TABLA usuario
        List<Usuario> usuarios = usuarioDao.seleccionar();
        usuarios.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}
