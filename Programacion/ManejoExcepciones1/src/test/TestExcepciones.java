package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionException;
/**
 *
 * @author ap
 */
public class TestExcepciones {
    public static void main(String[] args) {
        
                
        int resultado = 0;
        try{
            resultado = division(10,0);
        }catch(OperacionException e){
            System.out.println("Ocurrion un error de tipo OperacionException");
//        resultado = 10/0;
        }catch(Exception e){
            System.out.println("Ocurrio un error");
            e.printStackTrace(System.out);
        }finally{
            System.out.println("Se reviso una division entre 0 ");
        }
        System.out.println("resultado = " + resultado);
    }
}
