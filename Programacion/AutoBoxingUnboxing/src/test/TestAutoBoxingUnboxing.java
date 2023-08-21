package test;

/**
 *
 * @author ap
 */
public class TestAutoBoxingUnboxing {
    public static void main(String[] args) {
        /**
         * Clases Envolventes de tipos primitivos
         * int - Integer
         * long - Long
         * float - Float
         * double - Double
         * boolean - Boolean
         * byte - Byte
         * char - Character
         * short - Short
         **/
        
        Integer entero = 10;
        System.out.println("entero = " + entero);
        System.out.println("entero = " + entero.doubleValue());
    }
}
