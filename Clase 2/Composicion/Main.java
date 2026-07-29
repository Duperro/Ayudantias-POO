class Procesador{
    
    public void procesar(){
        System.out.println("Procesando...");
    }
}

class Computadora{
    private Procesador procesador;

    public Computadora() {
        procesador = new Procesador();
    }

    public void encender(){
        System.out.println("Encendiendo la computadora...");
        procesador.procesar();
    }
}

public class Main {
    public static void main(String[] args) {
        Computadora pc = new Computadora();
        pc.encender();
    }
}
