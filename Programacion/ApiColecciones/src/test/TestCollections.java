package test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author ap
 */
public class TestCollections {
    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
//        imprimir(miLista);
        System.out.println("SET");
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");//No se repiten los elementos al contrario de la lista
//        imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("Valor1", "Juan");
        miMapa.put("Valor2", "Andres");
        
        String elemento = (String)miMapa.get("Valor2");
        System.out.println("elemento = " + elemento);
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());

    }
    
    public static void imprimir(Collection coleccion){
//    for(Object elemento: coleccion){
//            System.out.println("elemento = " + elemento);
//        }
//        System.out.println("Funcion landa");
        //funcion landa
        coleccion.forEach(elemento->{
            System.out.println("elemento = " + elemento);});
//        System.out.println("Interface Set");
    }
}
