package Juegos;

import java.util.Scanner;

public class PPT {
    private String nom ;
        private int elecC,elecUsua;
        Scanner lect=new Scanner(System.in);
        public void iniciar() {
            System.out.println("Ingrese su nombre");
            nom=lect.next();
    
        }
    
        public void jugar() {
            System.out.println("Jugador "+nom+",elije: \n1.piedra\n2.papel \n3.tijera");
            elecUsua=lect.nextInt();
            elecC = (int)Math.floor(Math.random()*3);
        }
    
        public void finalizar() {
            if (elecUsua==1) {
                if (elecC==3) {
                    System.out.println("Jugador "+nom+ " ha salido tijera, usted ha ganado.");
                } else if (elecC==1){
                    System.out.println("Jugador "+nom+" ha salido piedra, ha quedado en empate.");
                }else if (elecC==2) {
                    System.out.println("Jugador "+nom+" ha salido papel, usted ha perdido.");      
                }

            } else if (elecUsua==2) {
                if (elecC==1) { 
                    System.out.println("Jugador "+nom+ "ha salido piedra, usted ha ganado.");
                } else if (elecC==2){
                    System.out.println("Jugador "+nom+" ha salido papel, ha quedado en empate");
                } else if (elecC==3) {
                    System.out.println("Jugador "+nom+" ha salido tijera, usted ha perdido.");
                    
                }
    
            } else if (elecUsua==3) {
                if (elecC==2) {
                    System.out.println("Jugador "+nom+ "ha salido papel, usted ha ganado.");
                } else if (elecC==3){
                    System.out.println("Jugador "+nom+" ha salido tijera, ha quedado en empate");
                } else if(elecC==1) {
                 System.out.println("Jugador "+nom+" ha salido piedra, usted ha perdido.");
                }
            } else{
                System.out.println("Opción inválida");
            }
        }
}
