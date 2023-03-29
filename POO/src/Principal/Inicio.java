package Principal;
import Salud.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona p1=new Persona(); 
        p1.pedirDatos();
        p1.mostrarPersona();
        p1.calcularImc(); 
        p1.mayorEdad();
    }
}
