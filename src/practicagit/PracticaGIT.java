/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicagit;

/**
 *
 * @author santi
 */
public class PracticaGIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola mundo");
    }
    
}

public class Productos{
    int id_producto;
    String nombre;
    double precio;
    String marca;
    String categoria;



}


public class Clientes{
    int id_cliente;
    String nombre;
    String pedidos;

    
}


public class Pedidos{
    int id_pedido;
    String fecha;
    String productos;
    String cliente;
}