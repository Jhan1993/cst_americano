package CstAmericano.main;

import CstAmericano.Dominio.Cliente;
import CstAmericano.datos.ClienteDAO;

public class ModificarCliente {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        var clientes = clienteDAO.listarClientes();
        if (!clientes.isEmpty()) {
            Cliente clienteExistente = clientes.get(1); //posicion al listar clientes (Empieza en 0)
            clienteExistente.setTipo_doc("Cedula Ciudadania");
            clienteExistente.setNumero_documento(1151956465);
            clienteExistente.setNombre_cliente("Claudia");
            clienteExistente.setApellido_cliente("Legarda");
            clienteExistente.setCiudad_cliente("Cali");
            clienteExistente.setDireccion_cliente("Calle 11 # 45-89");
            clienteExistente.setTelefono_cliente("3163027788");
            clienteExistente.setCorreo_cliente("clauleg@tumail.com");

            boolean modificado = clienteDAO.modificarCliente(clienteExistente);
            System.out.println("Cliente modificado: " + modificado);
        } else {
            System.out.println("No hay clientes para modificar.");
        }
    }
}
