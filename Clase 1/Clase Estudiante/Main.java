class Estudiante {
    String nombre;
    int edad;
    double nota1;
    double nota2;

    Estudiante(String nombre, int edad, double nota1, double nota2) {
        this.nombre = nombre;
        this.edad = edad;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    void calcularPromedio() {
        double promedio = (nota1 + nota2) / 2;
        System.out.println("El promedio de " + nombre + " es: " + promedio);
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Pepe", 22, 6.4, 8.0);
        estudiante1.calcularPromedio();
    }
}