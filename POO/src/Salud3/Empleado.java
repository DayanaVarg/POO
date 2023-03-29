package Salud3;
public class Empleado extends Persona {
    private String cargo, departamento;
    private float pro;
    private double hono;
    public Empleado(String tipoDoc, int documento, String nombre, String apellido,String departamento, String cargo,float valorHora,float horasTrabajadas) {
        super(tipoDoc, nombre, apellido, documento);
        this.cargo=cargo;
        this.departamento=departamento;
    }

    public void mostrarEmpleado(){
        System.out.println("Su tipo de documento es: "+getTipoDoc());
        System.out.println("Su documento es: "+getDocumento());
        System.out.println("Su nombre es: "+getNombre());
        System.out.println("Su apellido es: "+getApellido());
        System.out.println("Pertenece al departamento: "+departamento);
        System.out.println("Su cargo es: "+cargo);
    }

    public double calcularHonorarios(float valorHora,float horasTrabajadas){
        pro=valorHora*horasTrabajadas;
        hono=pro-((0.966*pro)/100);
        System.out.println("Sus honorarios son: "+hono);
        return hono;
    }
    
}
