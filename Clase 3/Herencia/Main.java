
class Empleado{
    protected String nombre;
    protected int edad;
    protected double salario;

    public Empleado(){
        this.nombre = "Sin Nombre";
        this.edad = 0;
        this.salario = 0.0;
    }

    public Empleado(String nombre, int edad, double salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Empleado(Empleado otroEmpleado){
        this.nombre = otroEmpleado.nombre;
        this.edad = otroEmpleado.edad;
        this.salario = otroEmpleado.salario;
    }

    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
}

class Desarrollador extends Empleado{
    public String lenguaje;

    public Desarrollador(String nombre, int edad, double salario, String lenguaje){
        super(nombre, edad, salario);
        this.lenguaje = lenguaje;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Lenguaje: " + lenguaje);
    }
}

class Gerente extends Empleado{
    public String departamento;

    public Gerente(String nombre, int edad, double salario, String departamento){
        super(nombre, edad, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Departamento: " + departamento);
    }
}



public class Main {
    public static void main(String[] args) {
        Empleado emp1 = new Empleado("Juan", 30, 500);

        Desarrollador dev1 = new Desarrollador("Fatima", 21, 700, "Python");

        Gerente ger1 = new Gerente("Moises", 26, 1000, "Ventas");

        emp1.mostrarInformacion();
        System.out.println();
        dev1.mostrarInformacion();
        System.out.println();
        ger1.mostrarInformacion();
    }
}
