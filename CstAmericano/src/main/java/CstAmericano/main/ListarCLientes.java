package CstAmericano.main;

import CstAmericano.datos.ClienteDAO;

public class ListarCLientes {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        // Listar clientes
        var clientes = clienteDAO.listarClientes();
        clientes.forEach(System.out::println);

    }
}