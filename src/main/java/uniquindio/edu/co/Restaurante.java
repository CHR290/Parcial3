package uniquindio.edu.co;

public class Restaurante {
    private String nombreComercial;
    private String nit;
    private String direccion;
    private Cliente clientes;
    private Pedido pedidos;
    private String empesasDomicilio;

    public Restaurante(String nombreComercial, String nit, String direccion, Cliente clientes, Pedido pedidos, String empesasDomicilio) {
        this.nombreComercial = nombreComercial;
        this.nit = nit;
        this.direccion = direccion;
        this.clientes = clientes;
        this.pedidos = pedidos;
        this.empesasDomicilio = empesasDomicilio;
    }

    public String getNombreComercial() {
        return nombreComercial;
    }

    public void setNombreComercial(String nombreComercial) {
        this.nombreComercial = nombreComercial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Cliente getClientes() {
        return clientes;
    }

    public void setClientes(Cliente clientes) {
        this.clientes = clientes;
    }

    public Pedido getPedidos() {
        return pedidos;
    }

    public void setPedidos(Pedido pedidos) {
        this.pedidos = pedidos;
    }

    public String getEmpesasDomicilio() {
        return empesasDomicilio;
    }

    public void setEmpesasDomicilio(String empesasDomicilio) {
        this.empesasDomicilio = empesasDomicilio;
    }
}
