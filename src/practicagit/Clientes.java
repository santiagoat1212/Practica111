package practicagit;

/**
 *
 * @author santi
 */
public class Clientes {
   public int id_cliente;
    public String nombre;
    public int pedidos;


    public void UPDATE(Connection objConnection) {
        try {
            String query = "update clientes set nombre = ?, pedidos = ? where id_cliente = ?";
            PreparedStatement objPS = objConnection.prepareStatement(query);
            objPS.setString(1, nombre);
            objPS.setInt(2, pedidos);
            objPS.setInt(3, id_cliente);
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
