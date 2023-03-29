package Juegos;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner lect=new Scanner(System.in);
        int elec,resp;
        do {
        System.out.println("Elija qué desea jugar\n1.Cara o Sello\n2.Piedra,Papel o Tijera");
        elec=lect.nextInt();
            switch (elec) {
                case 1:
                CaraSello juego1=new CaraSello();
                juego1.iniciar();
                juego1.jugar();
                juego1.finalizar();
                break;
                case 2:
                PPT juego2=new PPT();
                juego2.iniciar();
                juego2.jugar();
                juego2.finalizar();
                break;
            
                default:
                System.out.println("Elección inválida");
                    break;
            }
        System.out.println("¿Desea jugar de nuevo?\n1.Si\n2.No");
        resp=lect.nextInt();
        }while(resp==1);
        lect.close();
    }
}
