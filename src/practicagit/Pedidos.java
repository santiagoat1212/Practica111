package practicagit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Pedidos {
    public int id_pedido;
    public String fecha;
    public String productos;
    public String cliente;

    public void INSERT(Connection objConnection) {
        try {
            String query = "insert into Pedidos (id_pedido, id_cliente, id_producto) values (?, ?, ?)";
            PreparedStatement objPS = objConnection.prepareStatement(query);
            objPS.setInt(1, id_pedido);
            objPS.setInt(2, 1);
            objPS.setInt(3, 1);
            int filasinsertadas = objPS.executeUpdate();
            if (filasinsertadas == 0) {
                System.out.println("No se insertó nada en pedidos");
            } else {
                System.out.println("Se insertaron los datos en pedidos");
            }
        } catch (SQLException e) {
            System.err.println("Error al insertar en pedidos");
            System.err.println(e.toString());
        }
    }

    
}
