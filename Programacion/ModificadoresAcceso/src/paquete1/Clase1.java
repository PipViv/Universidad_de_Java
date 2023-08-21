package paquete1;

/**
 *
 * @author ap
 */
 class Clase1 {
    private String atributoPrivado = "Valor atributo private";
    
    private Clase1(){
        System.out.println("Constructor privado");
    }
    
    public Clase1(String arg){
        this();
        System.out.println("Constructor publico");
    }
//    
    private void metodoPrivate(){
    
        System.out.println("Metodo privado");
    
    }

    public String getAtributoPrivado() {
        return atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
    
    
    
}
