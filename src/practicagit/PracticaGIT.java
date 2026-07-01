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
        Productos producto1 = new Productos();
    producto1.id_producto=1;
    producto1.nombre="Celular";
    producto1.precio=10000;
    producto1.marca="Samsung";
    producto1.categoria="Electrónica";
    
    Productos producto2 = new Productos();
    producto2.id_producto=2;
    producto2.nombre="Laptop";
    producto2.precio=20000;
    producto2.marca="Dell";
    producto2.categoria="Computación";

    Productos producto3 = new Productos();
    producto3.id_producto=3;
    producto3.nombre="Tablet";
    producto3.precio=30000;
    producto3.marca="Apple";
    producto3.categoria="Electrónica";

    Clientes cliente1 = new Clientes();
    cliente1.id_cliente=1;
    cliente1.nombre="Juanito";
    cliente1.pedidos=3;

    Clientes cliente2 = new Clientes();
    cliente2.id_cliente=2;
    cliente2.nombre="Antua";
    cliente2.pedidos=2;

    Clientes cliente3 = new Clientes();
    cliente3.id_cliente=3;
    cliente3.nombre="Santiago";
    cliente3.pedidos=1;

    Pedidos pedido1 = new Pedidos();
    pedido1.id_pedido=1;
    pedido1.fecha="2026-01-07";
   
    Pedidos pedido2 = new Pedidos();
    pedido2.id_pedido=2;
    pedido2.fecha="2026-01-08";
    
    Pedidos pedido3 = new Pedidos();
    pedido3.id_pedido=3;
    pedido3.fecha="2026-01-03";
    }
    

    
}




