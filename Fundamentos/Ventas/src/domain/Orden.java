package domain;

/**
 *
 * @author ap
 */
public class Orden {

    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAXPRODUCTOS = 10;

    //CONSTRUCTOR
    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAXPRODUCTOS];
    }

    public void agregarProducto(Producto producto) {
        if(this.contadorProductos < Orden.MAXPRODUCTOS){
            this.productos[this.contadorProductos++]  = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos: " + MAXPRODUCTOS);
        }
    }

    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i < this.contadorProductos;i++){
//            Producto producto = this.productos[i];
//            total += producto.getPrecio();
            total += this.productos[i].getPrecio();
        }
        return 0;
    }

    public void mostrarOrden(){
        System.out.println("Id Orden: " + this.idOrden);
        double totalOrden = this.calcularTotal();
        System.out.println("El total de la Orden: $" + totalOrden);
        System.out.println("Productos de la Orden: ");
        for(int i  = 0; i < this.contadorProductos; i++){
            System.out.println(this.productos[i]);
        }
    }
}
