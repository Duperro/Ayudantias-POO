class Estudiante {
    public String nombre;
    public int edad;
    public String carrera;

    //Contructor Vacio
    public Estudiante() {
        this.nombre = "Sin Nombre";
        this.edad = 0;
        this.carrera = "Sin Carrera";
    }

    //Constructor con parametros
    public Estudiante(String nombre, int edad, String carrera) {
        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
    }

    //Constructor copia
    public Estudiante(Estudiante otroEstudiante){
        this.nombre = otroEstudiante.nombre;
        this.edad = otroEstudiante.edad;
        this.carrera = otroEstudiante.carrera;
    }

    // @Override
    // public String toString() {
    //     return "Estudiante{" +
    //             "nombre='" + nombre + '\'' +
    //             ", edad=" + edad +
    //             ", carrera='" + carrera + '\'' +
    //             '}';
    // }
}


public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante();

        Estudiante estudiante2 = new Estudiante("Juan", 20, "Ingeniería");

        Estudiante estudiante3 = new Estudiante(estudiante2);

        System.out.println(estudiante1);
        System.out.println(estudiante2);
        System.out.println(estudiante3);
    }
}