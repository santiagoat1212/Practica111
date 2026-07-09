package practicagit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author santi
 */
public class Clientes {
   public int id_cliente;
    public String nombre;
    public int pedidos;


    public void UPDATE(Connection objConnection, int id_cliente, String name, String first_name, String second_name) {
        try {
            String query = "update clientes set nombre = ?, pedidos = ? where id_cliente = ?";
            PreparedStatement objPS = objConnection.prepareStatement(query);
            objPS.setInt(1, id_cliente);
            objPS.setString(2, name);
            objPS.setString(3, first_name);
            objPS.setString(4, second_name);

            int filasActualizadas = objPS.executeUpdate();
            if (filasActualizadas == 0) {
                System.out.println("No se actualizó nada en clientes");
            } else {
                System.out.println("Se actualizaron los datos en clientes");
            }
        } catch (SQLException e) {
            System.err.println("Error al actualizar clientes");
            System.err.println(e.toString());
        }
    }
}
