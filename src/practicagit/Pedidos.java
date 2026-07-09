

package practicagit;

import java.sql.PreparedStatement;
import java.sql.SQLException;
 
 
public class Pedidos {
   public int id_pedido;


 

    public String fecha;
    public String productos;
    public String cliente;
    
    
    public void INSERT (java.sql.Connection objConnection){

        PracticaGIT objPracticaGIT = new PracticaGIT();
        objPracticaGIT.Funcion();
                
     try{
    String query="insert into Pedidos (id_pedido, id_cliente, id_producto) values (?, ?, ?)";
    PreparedStatement objPS = objConnection.prepareStatement(query);
    objPS.setInt(1,1);
     objPS.setInt(2,1);
      objPS.setInt(3,1);
       int filasinsertadas = objPS.executeUpdate();
       if(filasinsertadas==0){
          System.out.println("No se incerto nada");
       }else{
           System.err.println("Se incertaron los datos");
       }
} catch(SQLException e){
    System.err.println("Error");
    System.err.println(e.toString());
   } 
    }
}
