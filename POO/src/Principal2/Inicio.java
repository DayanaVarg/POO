package Principal2;
import java.util.Scanner;

import Salud2.Persona;
public class Inicio {
    public static void main(String[] args) {
        Persona p1=new Persona(); 
        Scanner lect=new Scanner(System.in);
        float peso, estatura;
        System.out.println("Ingrese su peso");
        peso=lect.nextFloat();
        System.out.println("Ingrese su estatura");
        estatura=lect.nextFloat();
        p1.pedirDatos();
        p1.mostrarPersona();
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        p1.mayorEdad();
        p1.calcularImc(peso,estatura);
        lect.close();        
    }
}
