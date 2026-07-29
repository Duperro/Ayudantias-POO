abstract class Figura{
    protected double x;
    protected double y;

    public Figura(){

    }

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double calcularArea();
}

class Rectangulo extends Figura{
    public Rectangulo(double x, double y) {
        super(x, y);
    }

    @Override
    public double calcularArea() {
        return x * y;
    }
}

class Circulo extends Figura{
    public Circulo(double radio) {
        super(radio, 0);
    }

    @Override
    public double calcularArea() {
        return Math.PI * x * x;
    }
}


public class Main {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 3);

        Figura circulo = new Circulo(5);

        System.out.println("Area del rectángulo: " + rectangulo.calcularArea());
        System.out.println("Area del círculo: " + circulo.calcularArea());
    }
}
