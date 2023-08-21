package test;

/**
 *
 * @author ap
 */
public class TestArreglos {

    public static void main(String[] args) {
        int edades[] = new int[3];
        System.out.println("edades = " + edades);
        
//        edades[0] = 10;
//        System.out.println("edades 0  = " + edades[0]);   
//        edades[3] = 5;

        for (int i = 0; i < edades.length; i ++){
            System.out.println("edades "+ i +" = " + edades[i]);}

        
        String frutas[] = {"Naranja","Manzana","Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println(frutas[i]);
        }
        
    }
    
}
