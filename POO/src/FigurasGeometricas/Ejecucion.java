package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        float radio;
        int elec, base, altura, resp,lado ;
        Scanner lect=new Scanner(System.in);

        do{
        System.out.println("Escoja la figura a la que le quiere sacar el área");
        System.out.println("1.Cuadradro\n2.Rectángulo\n3.Triángulo\n4.Círculo");
        elec=lect.nextInt();
        switch (elec) {
            case 1:
            System.out.println("Ingrese el valor del lado");
            lado=lect.nextInt();
    
            Cuadrado c1=new Cuadrado(lado);
            c1.calcularArea();
                break;
            case 2:
            System.out.println("Ingrese el valor de la base");
            base=lect.nextInt();
            System.out.println("Ingrese el valor de la altura");
            altura=lect.nextInt();
    
            Rectangulo r1=new Rectangulo(base, altura);
            r1.calcularArea();
            break;

            case 3:
            System.out.println("Ingrese el valor de la base");
            base=lect.nextInt();
            System.out.println("Ingrese el valor de la altura");
            altura=lect.nextInt();
    
            Triangulo t1=new Triangulo(base, altura);
            t1.calcularArea();
                break;

             case 4:
            System.out.println("Ingrese el valor del radio");
            radio=lect.nextFloat();
    
            Circulo ci1=new Circulo(radio);
            ci1.calcularArea();  
                break;
            default:
            System.out.println("Incorrecto");
                break;
        }
        System.out.println("¿Desea consultar otra figura?\n1.Si\n2.No");
        resp=lect.nextInt();

    }while(resp==1);
     lect.close();  
    }
 
}
