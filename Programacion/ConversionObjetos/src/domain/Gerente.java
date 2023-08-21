package domain;

/**
 *
 * @author ap
 */
public class Gerente extends Empleado{
    private String departamento;
    
    
    
    public Gerente(String nombre, double sueldo, String departamento) {
        super(nombre, sueldo);
        this.departamento = departamento;
    }
    
    @Override
    public String obtenerDetalles(){
        StringBuilder sb = new StringBuilder();
        sb.append("Gerente{");
        sb.append(super.obtenerDetalles());
        sb.append(" departamento=").append(departamento);
        sb.append('}');
        return sb.toString();
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    
    
    
}
