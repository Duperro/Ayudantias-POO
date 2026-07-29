package Interfaces;

public abstract class Animal {
    protected String nombre;
    protected int edad;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void dormir() {
        System.out.println(nombre + " está durmiendo.");
    }

    public abstract void hacerSonido();
}
