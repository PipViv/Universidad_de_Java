
package test;

import datos.Conexion;
import datos.IUsuarioDAO;
import datos.UsuarioDAO;
import domain.UsuarioDTO;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author ap
 */
public class TestManejoUsuarios {
    public static void main(String[] args) {
       
        IUsuarioDAO usuarioDao = new UsuarioDAO();
        
        List<UsuarioDTO> usuarios = usuarioDao.seleccionar();
        
        for(UsuarioDTO usuario: usuarios){
            System.out.println("usuario DTO = " + usuario);
        }
        
    }
}
