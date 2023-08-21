package paquete1;

//import paquete1.Clase1;
//import paquete2.ClaseHija;

/**
 *
 * @author ap
 */
public class TestModificadoresAcceso {
    public static void main(String[] args) {
//        Clase1 clase1 = new Clase1("Publico");
//        System.out.println("clase1 = " + clase1.atributoPublico);
//        clase1.metodoPublico();
//
//        ClaseHija claseHija = new ClaseHija();
//        System.out.println("claseHija = " + claseHija);

        Clase1 clase1 = new Clase1("Publico");
//        clase1.atributoDefault = "Cambio desde la prueba";
//        System.out.println("clase1 Atributo default = " + clase1.atributoDefault);
        
        clase1.setAtributoPrivado("Cambio valor de atributo");
        System.out.println(clase1.getAtributoPrivado());

    }
}
