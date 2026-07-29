import java.util.ArrayList;

class Cliente{
    private String numCliente;
    private String nombre;
    private String direccion;
    private String telefono;

    public Cliente(String numCliente, String nombre, String direccion, String telefono) {
        this.numCliente = numCliente;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }
}

class Agenda{
    private int numClientes;
    private ArrayList<Cliente> lista;

    public Agenda(){
        this.lista = new ArrayList<>();
        this.numClientes = 0;
    }

    public void agregarCliente(Cliente cliente){
        this.lista.add(cliente);
        this.numClientes++;
    }

    public void mostrar(){
        for (Cliente cliente : lista) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println();
        }
    }
}



public class Main {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("001", "Toyocosta", "Calle 123", "555-1234");
        Cliente cliente2 = new Cliente("002", "San Marino", "Avenida 456", "555-5678");

        Agenda agenda = new Agenda();

        agenda.agregarCliente(cliente1);
        agenda.agregarCliente(cliente2);
        agenda.mostrar();
    }
}