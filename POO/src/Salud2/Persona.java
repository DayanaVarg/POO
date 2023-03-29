package Salud2;
import java.util.Scanner;
public class Persona {
    private int documento,edad;
    private String tipoDoc,nombre,apellido,sexo;
    private float  pesoActual;

    public void pedirDatos(){
        Scanner lect=new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=lect.nextLine();
        System.out.println("Ingrese su número de documento");
        documento=lect.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lect.next();
        System.out.println("Ingrese su apellido");
        apellido=lect.next();
        System.out.println("Ingrese su edad");
        edad=lect.nextInt();
        System.out.println("Ingrese su género");
        sexo=lect.next();
        lect.close();
    }

    public void mostrarPersona(){
        System.out.println("Su tipo de documento es: "+tipoDoc);
        System.out.println("Su documento es: "+documento);
        System.out.println("Su nombre es: "+nombre);
        System.out.println("Su apellido es: "+apellido);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su género es: "+sexo);
    }

    public float calcularImc(float peso,float estatura){
        pesoActual=peso/(estatura*estatura);
        if (pesoActual<20) {
            System.out.println("PESOBAJO");
        } else if (pesoActual>=20 && pesoActual<=25) {
            System.out.println("PESOIDEAL");
        } else{
            System.out.println("SOBREPESO");
        }
        return pesoActual;
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Aún no es mayor de edad");
        }
    } 
}
