package domain;

/**
 *
 * @author ap
 */
public class Persona {
    
    private final int idPersona;
    private static int contadorPersonas;
    
    //BLOQUE DE INICIALIZACION ESTATICO
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    //BLOQUE DE INICIALIZACION NO ESTATICO
    {
        System.out.println("Ejecicion de bloque No Estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    public Persona(){
        System.out.println("Ejecucion del metodo constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona{");
        sb.append("idPersona=").append(idPersona);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
