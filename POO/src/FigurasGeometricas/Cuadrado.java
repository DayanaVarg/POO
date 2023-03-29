package FigurasGeometricas;

public class Cuadrado {
    private int lado;
    public Cuadrado(int lado){
    this.lado=lado;
    }

    public int getLado() {
        return lado;
    }



    public void setLado(int lado) {
        this.lado = lado;
    }


    public void calcularArea(){
        int area=0;
        area=lado*lado;
        System.out.println("El lado del cuadrado es "+lado+" y su area es "+area);
    }



  
}
