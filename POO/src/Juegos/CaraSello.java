package Juegos;

import java.util.Scanner;

public class CaraSello implements Juego {
    private String nom ;
    private int elecC,elecUsua;

    Scanner lect=new Scanner(System.in);
    public void iniciar() {
        System.out.println("Ingrese su nombre");
        nom=lect.next();

    }

    public void jugar() {
        System.out.println("Jugador "+nom+", escoja entre:\n 1.Cara\n 2.Sello");
        elecUsua=lect.nextInt();
        elecC = (int)Math.floor(Math.random()*2);
    }

    public void finalizar() {
        if (elecUsua==1) {
            if (elecC == 1) {
                System.out.println("Jugador "+nom+" ha salido cara, ha ganado");
            } else {
                System.out.println("Jugador "+nom+" ha salido sello, ha perdido.");
            }
        } else if (elecUsua==2) {
            if (elecC == 2) {

                System.out.println("Jugador "+nom+" ha salido sello, ha ganado");
            } else {
                System.out.println("Jugador "+nom+" ha salido cara, ha perdido.");
            }
        }
    }
    
}
