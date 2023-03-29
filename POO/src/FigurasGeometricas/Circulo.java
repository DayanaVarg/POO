package FigurasGeometricas;

public class Circulo {
    private float radio;
    double area=0;
    public Circulo(float radio){
        this.radio=radio;
    }
    public float getRadio() {
        return radio;
    }
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public void calcularArea(){
        area=3.14*(radio*radio);
        System.out.println("El radio del círculo es: "+radio);
        System.out.println("El área del círculo es: "+area);   
    }
}
