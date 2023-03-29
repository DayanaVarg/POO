package Principal3;
import Salud3.Persona;

import java.util.Scanner;

import Salud3.Empleado;
public class Inicio {
    public static void main(String[] args) {
        String cargo, departamento;
        float valorHora,horasTrabajadas;
        Scanner lect=new Scanner(System.in);
        System.out.println("Ingrese su departamento");
        departamento=lect.nextLine();
        System.out.println("Ingrese su cargo");
        cargo=lect.nextLine();
        System.out.println("Ingrese sus horas trabajadas");
        horasTrabajadas=lect.nextFloat();
        System.out.println("Ingrese el valor por hora");
        valorHora=lect.nextFloat();
        Persona p1=new Persona();
        p1.pedirDatos();
        Empleado e1=new Empleado(p1.getTipoDoc(),p1.getDocumento(),p1.getNombre(),p1.getApellido(),departamento,cargo,valorHora,horasTrabajadas);
        e1.mostrarEmpleado();
        e1.calcularHonorarios(valorHora, horasTrabajadas);
        lect.close();

    }
}
