package CstAmericano.main;

import CstAmericano.datos.ClienteDAO;

public class EliminarCLiente {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        var clientes = clienteDAO.listarClientes();
        if (!clientes.isEmpty()) {
            int idCliente = clientes.get(0).getId(); // Posicion al eliminar cliente (Empieza en 0)
            boolean eliminado = clienteDAO.eliminarCliente(idCliente);
            System.out.println("Cliente eliminado: " + eliminado);

        }else {
            System.out.println("No hay clientes para eliminar.");
        }
    }
}
