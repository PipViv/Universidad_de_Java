package test;

import accesodatos.IAccesoDatos;
import accesodatos.ImplementacionMySQL;
import accesodatos.ImplementacionOracle;

/**
 *
 * @author ap
 */
public class testInterfaces {
    public static void main(String[] args) {
        IAccesoDatos datos  = new ImplementacionMySQL();
//        datos.listar();
        imprimir(datos);
        
        datos = new ImplementacionOracle();
        imprimir(datos);
    }
    
    public static void imprimir(IAccesoDatos datos){
        datos.listar();
    }
}
