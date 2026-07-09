package practicagit;
import java.sql.Connection;
import java.sql.DriverManager;
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
    
   
        
        public void eliminar(Connection objConnection, int idProducto) {
            
            
    try {
        String sql = "DELETE FROM productos WHERE id_producto=?";

        PreparedStatement ps = objConnection.prepareStatement(sql);
        ps.setInt(1, idProducto);

        ps.executeUpdate();

        System.out.println("Producto eliminado");
         ps.close();

    } catch(Exception e){
        System.out.println(e.getMessage());
    }
}//llave de la funcion
       
        
       

    
        
       
}

