package CstAmericano.Dominio;

public class Cliente {
    private int id;
    private String tipo_doc;
    private int numero_documento;
    private String nombre_cliente;
    private String apellido_cliente;
    private String ciudad_cliente;
    private String direccion_cliente;
    private String telefono_cliente;
    private String correo_cliente;

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_doc() {
        return tipo_doc;
    }

    public void setTipo_doc(String tipo_doc) {
        this.tipo_doc = tipo_doc;
    }

    public int getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(int numero_documento) {
        this.numero_documento = numero_documento;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getApellido_cliente() {
        return apellido_cliente;
    }

    public void setApellido_cliente(String apellido_cliente) {
        this.apellido_cliente = apellido_cliente;
    }

    public String getCiudad_cliente() {
        return ciudad_cliente;
    }

    public void setCiudad_cliente(String ciudad_cliente) {
        this.ciudad_cliente = ciudad_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", tipo_doc='" + tipo_doc + '\'' +
                ", numero_documento=" + numero_documento +
                ", nombre_cliente='" + nombre_cliente + '\'' +
                ", apellido_cliente='" + apellido_cliente + '\'' +
                ", ciudad_cliente='" + ciudad_cliente + '\'' +
                ", direccion_cliente='" + direccion_cliente + '\'' +
                ", telefono_cliente='" + telefono_cliente + '\'' +
                ", correo_cliente='" + correo_cliente + '\'' +
                '}';
    }
}