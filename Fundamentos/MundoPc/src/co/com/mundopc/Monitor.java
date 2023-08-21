package co.com.mundopc;

/**
 *
 * @author ap
 */
public class Monitor {

    
    private final int idMonitor;
    private String marca;
    private double tamano;
    private static int contaodrMonitores;
    
    private Monitor(){
        this.idMonitor = ++Monitor.contaodrMonitores;
    }
    public Monitor(String marca, double tamano){
        this();
        this.marca = marca;
        this.tamano = tamano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }
    
    public static int getContaodrMonitores() {
        return contaodrMonitores;
    }

    public static void setContaodrMonitores(int aContaodrMonitores) {
        contaodrMonitores = aContaodrMonitores;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Monitor{");
        sb.append("idMonitor=").append(idMonitor);
        sb.append(", marca=").append(marca);
        sb.append(", tamano=").append(tamano);
        sb.append('}');
        return sb.toString();
    }
    
    
}
