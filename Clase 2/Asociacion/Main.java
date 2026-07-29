class chofer{
    private String nombre;

    public chofer(String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class taxi{
    private chofer chofer;
    private String matricula;

    public taxi(chofer chofer, String matricula){
        this.chofer = chofer;
        this.matricula = matricula;
    }

    public void mostrarInformacion(){
        System.out.println("Chofer: " + chofer.getNombre());
        System.out.println("Matricula: " + matricula);
    }
}


public class Main{
    public static void main(String[] args) {
        chofer chofer1 = new chofer("Rafael Bermeo");
        taxi taxi1 = new taxi(chofer1, "ABC-123");

        taxi1.mostrarInformacion();
    }
}