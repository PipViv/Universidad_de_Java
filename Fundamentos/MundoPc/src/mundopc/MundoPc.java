package mundopc;

import co.com.mundopc.Computadora;
import co.com.mundopc.Monitor;
import co.com.mundopc.Orden;
import co.com.mundopc.Raton;
import co.com.mundopc.Teclado;

/**
 *
 * @author ap
 */
public class MundoPc {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 18);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora ("Computadora HP", monitorHP, tecladoHP, ratonHP);
    
        Monitor monitorACER = new Monitor("ACER", 18);
        Teclado tecladoTEZARRE = new Teclado("bluetooth", "TEZARRE");
        Raton ratonLOGITECH = new Raton("bluetooth", "LOGITECH");
        Computadora computadoraGAMER = new Computadora ("Computadora GAMER", monitorACER, tecladoTEZARRE, ratonLOGITECH);
    
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGAMER);
        orden1.mostrarOrden();
        
    }
}
