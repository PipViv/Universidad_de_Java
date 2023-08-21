package test;

import domain.FiguraGeometrica;
import domain.Rectangulo;

/**
 *
 * @author ap
 */
public class TestClasesAbstractas {
    public static void main(String[] args) {
        FiguraGeometrica figura = new Rectangulo("Rectangulo");
        figura.dibujar();
    }
}
