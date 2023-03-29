package FigurasGeometricas;

public class Rectangulo {
    private int base, altura, area=0;
    public Rectangulo(int base, int altura){
        this.base=base;
        this.altura=altura;
    }
    public int getBase() {
        return base;
    }
    public void setBase(int base) {
        this.base = base;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void calcularArea(){
        area=base*altura;
        System.out.println("La base del rectángulo es "+base+" y la altura es "+altura);
        System.out.println("El área del rectángulo es: "+area);
    }
}
