package practicagit;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class Productos {
    public int id_producto;
    public String nombre;
    public double precio;
    public String marca;
    public String categoria;

    

    public void DELETE(Connection objConnection) {
        try {
            String query = "delete from productos where id_producto = ?";
            PreparedStatement objPS = objConnection.prepareStatement(query);
            objPS.setInt(1, id_producto);
            int filasBorradas = objPS.executeUpdate();
            if (filasBorradas == 0) {
                System.out.println("No se eliminó nada en productos");
            } else {
                System.out.println("Se eliminó el producto");
            }
        } catch (SQLException e) {
            System.err.println("Error al eliminar producto");
            System.err.println(e.toString());
        }
    }
}

    
        
       
}

