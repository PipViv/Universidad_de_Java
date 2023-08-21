package co.com.peliculas.datos;

import co.com.peliculas.domain.Pelicula;
import co.com.peliculas.excepciones.AccesoDatosEx;
import co.com.peliculas.excepciones.EscrituraDatosEx;
import co.com.peliculas.excepciones.LecturaDatosEx;
import java.util.List;

/**
 *
 * @author ap
 */
public interface IAccesoDatos {

    boolean existe(String nombreRecurso) throws AccesoDatosEx;

    List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx;

    void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx;

    String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx;

    void crear(String nombreRecurso) throws AccesoDatosEx;

    void borrar(String nombreRecurso) throws AccesoDatosEx;
}
