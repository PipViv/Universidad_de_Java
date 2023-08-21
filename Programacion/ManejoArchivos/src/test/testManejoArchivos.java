package test;

import static manejoArchivo.ManejoArchivo.*;

/**
 *
 * @author ap
 */
public class testManejoArchivos {

    public static void main(String[] args) {
        var nombreArchivo = "/home/ap/Documentos/Prueba.txt";
//        crearArchivo(nombreArchivo);
//        escribirArchivo(nombreArchivo, "Hola desde Java");
//        anexarArchivo(nombreArchivo, "adios");

        leerArchivo(nombreArchivo);
    }
}
