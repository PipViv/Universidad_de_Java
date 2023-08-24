package datos;


import domain.UsuarioDTO;
import java.util.List;

/**
 *
 * @author ap
 */
public interface IUsuarioDAO{
    
    public List<UsuarioDTO> seleccionar();
    public int insertar(UsuarioDTO usuario);
    public int actualizar(UsuarioDTO usuario);
    public int eliminar(UsuarioDTO usuario);
}
