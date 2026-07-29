class Animal{
    protected String nombre;

    public Animal(String nombre) { //Constructor con Parametros
        this.nombre = nombre;
    }

    public void hacerSonido() {
        System.out.println(nombre + " hace un sonido.");
    }
}

class Perro extends Animal{

    public Perro(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " ladra.");
    }
}

class Gato extends Animal{

    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println(nombre + " maulla.");
    }
}


public class Main{
    public static void main(String[] args) {
        Animal[] animales = new Animal[5];

        animales[0] = new Perro("Rocky");
        animales[1] = new Gato("Garfield");

        Perro perro1 = new Perro("Kevin");

        animales[2] = perro1;

        for (Animal animal : animales){
            animal.hacerSonido();
        }
    }
}