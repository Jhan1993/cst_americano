package CstAmericano.main;

import CstAmericano.Dominio.Cliente;
import CstAmericano.datos.ClienteDAO;

public class CrearCliente {
    public static void main(String[] args) {
        ClienteDAO clienteDAO = new ClienteDAO();

        // Crear un nuevo cliente
        Cliente nuevoCliente = new Cliente();
        nuevoCliente.setTipo_doc("Cedula Ciudadania");
        nuevoCliente.setNumero_documento(1151949782);
        nuevoCliente.setNombre_cliente("Francisco");
        nuevoCliente.setApellido_cliente("Villalobos");
        nuevoCliente.setCiudad_cliente("Cali");
        nuevoCliente.setDireccion_cliente("Calle 25 Cra 1");
        nuevoCliente.setTelefono_cliente("3120000001    ");
        nuevoCliente.setCorreo_cliente("villa.fran@tumail.com");

        boolean creado = clienteDAO.crearCliente(nuevoCliente);
        System.out.println("Cliente creado: " + creado);

    }
}
