package uniquindio.edu.co;

import uniquindio.edu.co.Enums.EstadoPedido;
import uniquindio.edu.co.Enums.ModalidadEntrega;

import java.util.Date;

public class Pedido {
    private String codigo;
    private Date fecha;
    private Cliente cliente;
    private ModalidadEntrega modalidadEntrega;
    private String lineas;
    private EstadoPedido estado;
    private boolean servicioDomicilio;
    private String distanciaKm;
    private double costoDomicilio;

    public Pedido(String codigo, Date fecha, Cliente cliente, ModalidadEntrega modalidadEntrega, String lineas, EstadoPedido estado, boolean servicioDomicilio, String distanciaKm, double costoDomicilio) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.cliente = cliente;
        this.modalidadEntrega = modalidadEntrega;
        this.lineas = lineas;
        this.estado = estado;
        this.servicioDomicilio = servicioDomicilio;
        this.distanciaKm = distanciaKm;
        this.costoDomicilio = costoDomicilio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ModalidadEntrega getModalidadEntrega() {
        return modalidadEntrega;
    }

    public void setModalidadEntrega(ModalidadEntrega modalidadEntrega) {
        this.modalidadEntrega = modalidadEntrega;
    }

    public String getLineas() {
        return lineas;
    }

    public void setLineas(String lineas) {
        this.lineas = lineas;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public boolean isServicioDomicilio() {
        return servicioDomicilio;
    }

    public void setServicioDomicilio(boolean servicioDomicilio) {
        this.servicioDomicilio = servicioDomicilio;
    }

    public String getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(String distanciaKm) {
        this.distanciaKm = distanciaKm;
    }

    public double getCostoDomicilio() {
        return costoDomicilio;
    }

    public void setCostoDomicilio(double costoDomicilio) {
        this.costoDomicilio = costoDomicilio;
    }
}
