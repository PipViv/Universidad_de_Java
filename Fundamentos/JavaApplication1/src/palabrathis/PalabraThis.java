package palabrathis;

/**
 *
 * @author ap
 */
public class PalabraThis {
    public static void main(String[] args) {
        Persona persona = new Persona("Andres","Paz");
        System.out.println("Persona = " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
        new Imprimir().imprimir(persona);
        
        
    }
    
}

class Persona {
    String nombre;
    String apellido;
    
    Persona(String nombre, String apellido){
        //super(); llama a la clase padre (object)
    this.nombre = nombre;
    this.apellido = apellido;
    
        System.out.println("variable this " + this);
    }
}

class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde Imprimir: " + persona);
        System.out.println("this" + this) ;
    }
}
