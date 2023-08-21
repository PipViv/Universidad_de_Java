package domain;

import java.util.Date;

/**
 *
 * @author ap
 */
public class Cliente extends Persona{
    
    private static int idCliente;

    
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;

    public Cliente(Date fechaRegistro, boolean vip, String nombre, char genero, int edad, String direccion) {
        super(nombre, genero, edad, direccion);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }

    public Cliente(String nombre, Date fechaRegistro, boolean vip) {
        super(nombre);
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
        this.idCliente = ++Cliente.contadorCliente;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
    
    public static int getIdCliente() {
        return idCliente;
    }

    public static void setIdCliente(int aIdCliente) {
        idCliente = aIdCliente;
    }

    public static int getContadorCliente() {
        return contadorCliente;
    }

    public static void setContadorCliente(int aContadorCliente) {
        contadorCliente = aContadorCliente;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append(", ").append(super.toString());
        sb.append('}');
        return sb.toString();
    }
    
    
}
