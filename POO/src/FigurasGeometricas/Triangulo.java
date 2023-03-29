package FigurasGeometricas;
public class Triangulo {
    private int base, altura, area=0;
    public Triangulo(int base, int altura){
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
        area=(base*altura)/2;
        System.out.println("La base del triángulo es "+base+" y la altura es "+altura);
        System.out.println("El área del triángulo es: "+area);
    } 
}
