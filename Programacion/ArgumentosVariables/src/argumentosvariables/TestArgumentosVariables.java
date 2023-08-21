package argumentosvariables;

/**
 *
 * @author ap
 */
public class TestArgumentosVariables {

    public static void main(String[] args) {
        imprimirNumeros(9,8,7,6,5,4,3,2,1);
        variosParametros("Andres",8,9,10,11,12,13);
    }
    
    private static void imprimirNumeros(int... numeros){
        for(int i = 0; i< numeros.length; i++){
            System.out.println("Elemento "+i+": "+numeros[i]);
        }
    }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("nombre = " + nombre);
        imprimirNumeros(numeros);
    }
    
}
