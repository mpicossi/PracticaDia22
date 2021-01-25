package demo;

public class Circulo extends FiguraGeometrica{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //El error que aparece es que debemos sobre-escribir los metodos abstractos definidos en la clase Padre.
    @Override
    public double area() {
        return Math.PI*Math.pow(radio,2);
    }
}
