package Interfaces;

class Perro extends Animal{
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}

class Pajaro extends Animal implements Volador{
    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override //Metodo de clase abstracta
    public void hacerSonido() {
        System.out.println("El pájaro canta.");
    }

    @Override //Metodo de la Interfaz
    public void volar() {
        System.out.println("El pájaro vuela.");
    }
}

class Pez extends Animal implements Nadador {

    public Pez(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override //Metodo de clase abstracta
    public void hacerSonido() {
        System.out.println("Glu glu.");
    }

    @Override //Metodo de la Interfaz
    public void nadar() {
        System.out.println("El pez nada.");
    }
}

class Pato extends Animal implements Nadador, Volador{
    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override //Metodo de clase abstracta
    public void hacerSonido() {
        System.out.println("El pato grazna.");
    }

    @Override //Metodo de la Interfaz
    public void nadar() {
        System.out.println("El pato nada.");
    }

    @Override //Metodo de la Interfaz
    public void volar() {
        System.out.println("El pato vuela.");
    }
}

public class Main {
    public static void main(String[] args) {
        // Al haber creado la Instancias de tipo Animal, solo podemos acceder a los métodos definidos en la clase abstracta, no a los de las interfaces.
        // Animal perro = new Perro("Fido", 5);
        // Animal pajaro = new Pajaro("Piquito", 2);
        // Animal pez = new Pez("Nemo", 1);
        // Animal pato = new Pato("Donald", 3);

        //Al crear las instancias con su tipo específico, podemos acceder a los métodos de la clase abstracta y de las interfaces.
        Perro perro = new Perro("Fido", 5);
        Pajaro pajaro = new Pajaro("Piquito", 2);
        Pez pez = new Pez("Nemo", 1);
        Pato pato = new Pato("Donald", 3);

        perro.hacerSonido();
        pajaro.hacerSonido();
        pez.hacerSonido();
        pato.hacerSonido();

        pajaro.volar();
        pato.volar();
        pez.nadar();
        pato.nadar();
    }
}
