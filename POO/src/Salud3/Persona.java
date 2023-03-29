package Salud3;
import java.util.Scanner;
public class Persona {
    private int documento,edad;
    private String tipoDoc,nombre,apellido,sexo;
    private float peso, estatura, pesoActual;

    public Persona(){
    }
    public Persona(String tipoDoc, String nombre,String apellido,int documento){
        this.tipoDoc=tipoDoc;
        this.nombre=nombre;
        this.apellido=apellido;
        this.documento=documento;
    }

    

    public int getDocumento() {
        return documento;
    }



    public void setDocumento(int documento) {
        this.documento = documento;
    }



    public String getTipoDoc() {
        return tipoDoc;
    }



    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
    }



    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    public String getApellido() {
        return apellido;
    }



    public void setApellido(String apellido) {
        this.apellido = apellido;
    }



    public void pedirDatos(){
        Scanner lect=new Scanner(System.in);
        System.out.println("Ingrese su tipo de documento");
        tipoDoc=lect.next();
        System.out.println("Ingrese su número de documento");
        documento=lect.nextInt();
        System.out.println("Ingrese su nombre");
        nombre=lect.next();
        System.out.println("Ingrese su apellido");
        apellido=lect.next();
        System.out.println("Ingrese su peso (en Kg)");
        peso=lect.nextFloat();
        System.out.println("Ingrese su estatura (en m)");
        estatura=lect.nextFloat();
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
        System.out.println("Su peso es: "+peso);
        System.out.println("Su estatura es: "+estatura);
        System.out.println("Su edad es: "+edad);
        System.out.println("Su género es: "+sexo);
    }

    public void calcularImc(){
        pesoActual=peso/(estatura*estatura);
        if (pesoActual<20) {
            System.out.println("El peso está por debajo de lo ideal");
        } else if (pesoActual>=20 && pesoActual<=25) {
            System.out.println("El peso es ideal");
        } else{
            System.out.println("Usted tiene sobrepeso");
        }
    }

    public void mayorEdad(){
        if (edad>=18) {
            System.out.println("Usted es mayor de edad");
        } else {
            System.out.println("Aún no es mayor de edad");
        }
    }
}



