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

   public void modificar(Connection objConnection, int id_cliente, String name, String first_name, String second_name) {
       
       
       PracticaGIT objPracticaGIT2 = new PracticaGIT();
       objPracticaGIT2.Funcion();

        try {

            String sql = "UPDATE clientes SET name=?, first_name=?, second_name=? WHERE id_cliente=?";
        PreparedStatement ps = objConnection.prepareStatement(sql);
        ps.setInt(1, id_cliente);
        ps.setString(2, name);       
        ps.setString(3, first_name);
        ps.setString(4, second_name);
        

            ps.executeUpdate();

            System.out.println("Cliente modificado");

            ps.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
