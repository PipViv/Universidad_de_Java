package co.com.peliculas.datos;

import co.com.peliculas.domain.Pelicula;
import co.com.peliculas.excepciones.AccesoDatosEx;
import co.com.peliculas.excepciones.EscrituraDatosEx;
import co.com.peliculas.excepciones.LecturaDatosEx;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ap
 */
public class AccesoDatosImpl implements IAccesoDatos{

    @Override
    public boolean existe(String nombreRecurso) throws AccesoDatosEx {
        File archivo = new File(nombreRecurso);
        return archivo.exists();
    }

    @Override
    public List<Pelicula> listar(String nombreRecurso) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        List<Pelicula> peliculas = new ArrayList<>();
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String linea = "";
            linea = entrada.readLine();
            while(linea != null){
            Pelicula pelicula = new Pelicula(linea);
            peliculas.add(pelicula);
            linea = entrada.readLine();
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        }catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        } 
        return peliculas;
    }

    @Override
    public void escribir(Pelicula pelicula, String nombreRecurso, boolean anexar) throws EscrituraDatosEx {
        File archivo = new File(nombreRecurso);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(pelicula.toString());
            salida.close();
            System.out.println("Se ha escrito informacion al archivo: "+pelicula);
        } catch (IOException ex) {
            throw new EscrituraDatosEx("Excepcion al escribir peliculas:" + ex.getMessage());
        }
    }

    @Override
    public String buscar(String nombreRecurso, String buscar) throws LecturaDatosEx {
        File archivo = new File(nombreRecurso);
        String resultado = null;
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            String linea = null;
            linea = entrada.readLine();
            int indice = 1;
            while(linea != null){
                if(buscar != null && buscar.equalsIgnoreCase(linea)){
                    resultado = "Pelicula "+linea + "encontrada en el indice "+ indice;
                    break;
                }
                linea = entrada.readLine();
                indice++;
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new LecturaDatosEx("Excepcion al listar peliculas:" + ex.getMessage());
        }
        return resultado;
        
    }

    @Override
    public void crear(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("Se ha creado el archivo");
        } catch (IOException ex) {
            ex.printStackTrace();
            throw new AccesoDatosEx("Excepcion al crear archivo:" + ex.getMessage());
        }
    }

    @Override
    public void borrar(String nombreRecurso) throws AccesoDatosEx {
        var archivo = new File(nombreRecurso);
        if (archivo.exists())
            archivo.delete();
        System.out.println("Se ha borrado el archivo");
    }
    
}
