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
            
            PracticaGIT objPracticaGIT = new PracticaGIT();
            objPracticaGIT.ConexionDB();
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
       
        
        public void insertar(java.sql.Connection objConnection) {

    try {

        String sql = "INSERT INTO clientes (id_cliente, nombre, apellidoP, apellidoM) VALUES (?, ?, ?, ?)";

        PreparedStatement ps = objConnection.prepareStatement(sql);

        ps.setInt(1, 1);
        ps.setString(2, "goku");
        ps.setString(3, "legana");
        ps.setString(4, "atodos");

        ps.executeUpdate();

        System.out.println("Cliente insertado correctamente");

        ps.close();

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
}

    
        
       
}

