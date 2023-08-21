package ventas.test;

import domain.Orden;
import domain.Producto;
/**
 *
 * @author ap
 */
public class VentasTest {
    public static void main(String[] args) {
        Producto producto1 = new Producto("Camisa", 50.000);
        Producto producto2 = new Producto("Pantalon", 80.000);
        Orden orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        
        Producto producto3 = new Producto("Zapatos", 60.000);
        
        orden1.agregarProducto(producto3);
        
        orden1.mostrarOrden();
    }
}
