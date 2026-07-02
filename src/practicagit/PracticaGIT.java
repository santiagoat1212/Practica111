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
        Clientes cliente1 = new Clientes();
        cliente1.id_cliente=1;
        cliente1.nombre="Antua";
        cliente1.pedidos=10;
        
        Clientes cliente2 = new Clientes();
        cliente2.id_cliente=2;
        cliente2.nombre="Santi";
        cliente2.pedidos=4;
        
        Clientes cliente3 = new Clientes();
        cliente3.id_cliente=3;
        cliente3.nombre="Arturo";
        cliente3.pedidos=8;
        
        Pedidos pedido1 = new Pedidos();
        pedido1.id_pedido=1;
        pedido1.fecha="lunes";
        pedido1.productos="4";
        pedido1.cliente="Antua";
       
        Pedidos pedido2 = new Pedidos();
        pedido2.id_pedido=2;
        pedido2.fecha="miercoles";
        pedido2.productos="8";
        pedido2.cliente="Santi";
        
        Pedidos pedido3 = new Pedidos();
        pedido3.id_pedido=3;
        pedido3.fecha="lunes";
        pedido3.productos="4";
        pedido3.cliente="Arturo";
        
        Productos producto1 = new Productos();
        producto1.id_producto=1;
        producto1.nombre="celular";
        producto1.precio=45000;
        producto1.marca="iphone";
        producto1.categoria="electronicos";
        
        Productos producto2 = new Productos();
        producto2.id_producto=2;
        producto2.nombre="tablet";
        producto2.precio=24000;
        producto2.marca="samsung";
        producto2.categoria="electronico";
        
        Productos producto3 = new Productos();
        producto3.id_producto=3;
        producto3.nombre="reloj";
        producto3.precio=5000;
        producto3.marca="rolex";
        producto3.categoria="electronico";
        
        
      
        
        
        // TODO code application logic here
    }
    
}
