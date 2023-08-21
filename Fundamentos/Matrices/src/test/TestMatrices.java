package test;

import domain.Persona;

/**
 *
 * @author ap
 */
public class TestMatrices {

    public static void main(String[] args) {
        int edades[][] = new int[3][2];
        System.out.println("edades = " + edades);

        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;

        for (int renglones = 0; renglones < edades.length; renglones++) {
            for(int columnas = 0; columnas < edades[renglones].length; columnas++){
                System.out.println("edades " + renglones + " - " + columnas + ": " + edades[renglones][columnas]);
            
            }
        }
        
        String frutas[][] = {{"Naranja", "Limon"}, {"Fresa", "Mora"}};
        for(int ii = 0; ii<frutas.length;ii++){
            for(int jj=0;jj<frutas[ii].length;jj++){
                System.out.println("Frutas "+ii+" - "+jj+": " + frutas[ii][jj]);
            }
        }
        
        
        
        
        Persona personas[][] = new Persona[2][3];
        
        personas[0][0] = new Persona("Andres");
        personas[0][1] = new Persona("Felipe");
        imprimir(personas);
    }
    
    public static void imprimir(Object matriz[][]){
        for(int ff = 0; ff < matriz.length; ff++){
            for(int cc = 0; cc<matriz[ff].length; cc++){
                System.out.println("Frutas "+ff+" - "+cc+": " + matriz[ff][cc]);
            }
                
        }
    
    }
}
