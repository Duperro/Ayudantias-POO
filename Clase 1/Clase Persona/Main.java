class Persona {
    private String nombre;
    private int edad;

    public String getNombre() { // Método getter para el atributo nombre
        return nombre;
    }

    public void setNombre(String nombre) { // Método setter para el atributo nombre
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            System.out.println("La edad no puede ser negativa. Se establecerá a 0.");
            this.edad = 0; // Establecer a 0 si la edad es negativa
        } else {
            this.edad = edad;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        persona1.setNombre("Rafael");
        persona1.setEdad(-5);

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());

    }
}
