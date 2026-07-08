package practicagit;
import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 *
 * @author santi
 */
public class Clientes {
   public int id_cliente;
    public String nombre;
    public int pedidos;

   public void modificar(Connection objConnection, int id, String nombre) {
       
       
       PracticaGIT objPracticaGIT2 = new PracticaGIT();
       objPracticaGIT2.ConexionDB();

        try {

            String sql = "UPDATE clientes SET nombre=? WHERE id_clientes=?";

            PreparedStatement ps = objConnection.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Cliente modificado");

            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
