package CstAmericano.datos;

import CstAmericano.Dominio.Cliente;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection getConexion() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/cst_americano_db", "root", "root");
        } catch (SQLException e) {
            throw new RuntimeException("Error al conectar con la base de datos", e);
        }
    }

    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        String sql = "SELECT * FROM cliente ORDER BY numero_documento";
        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setTipo_doc(rs.getString("tipo_doc"));
                cliente.setNumero_documento(rs.getInt("numero_documento"));
                cliente.setNombre_cliente(rs.getString("nombre_cliente"));
                cliente.setApellido_cliente(rs.getString("apellido_cliente"));
                cliente.setCiudad_cliente(rs.getString("ciudad_cliente"));
                cliente.setDireccion_cliente(rs.getString("direccion_cliente"));
                cliente.setTelefono_cliente(rs.getString("telefono_cliente"));
                cliente.setCorreo_cliente(rs.getString("correo_cliente"));
                clientes.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al listar clientes: " + e.getMessage());
        }
        return clientes;
    }

    public boolean crearCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente (tipo_doc, numero_documento, nombre_cliente, apellido_cliente, ciudad_cliente, direccion_cliente, telefono_cliente, correo_cliente) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getTipo_doc());
            ps.setInt(2, cliente.getNumero_documento());
            ps.setString(3, cliente.getNombre_cliente());
            ps.setString(4, cliente.getApellido_cliente());
            ps.setString(5, cliente.getCiudad_cliente());
            ps.setString(6, cliente.getDireccion_cliente());
            ps.setString(7, cliente.getTelefono_cliente());
            ps.setString(8, cliente.getCorreo_cliente());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al crear cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET tipo_doc=?, numero_documento=?, nombre_cliente=?, apellido_cliente=?, ciudad_cliente=?, direccion_cliente=?, telefono_cliente=?, correo_cliente=? WHERE id=?";
        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, cliente.getTipo_doc());
            ps.setInt(2, cliente.getNumero_documento());
            ps.setString(3, cliente.getNombre_cliente());
            ps.setString(4, cliente.getApellido_cliente());
            ps.setString(5, cliente.getCiudad_cliente());
            ps.setString(6, cliente.getDireccion_cliente());
            ps.setString(7, cliente.getTelefono_cliente());
            ps.setString(8, cliente.getCorreo_cliente());
            ps.setInt(9, cliente.getId());
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al modificar cliente: " + e.getMessage());
            return false;
        }
    }

    public boolean eliminarCliente(int id) {
        String sql = "DELETE FROM cliente WHERE id=?";
        try (Connection con = getConexion();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
            return false;
        }
    }
}