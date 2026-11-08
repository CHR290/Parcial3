package uniquindio.edu.co;

import java.util.List;

public class Cliente {
    private String numeroDocumento;
    private String nombreCompleto;
    private String telefono;
    private String correo;
    private String direccionResidencia;
    private List historialPedidos;

    public Cliente(String numeroDocumento, String nombreCompleto, String telefono, String correo, String direccionResidencia, List historialPedidos) {
        this.numeroDocumento = numeroDocumento;
        this.nombreCompleto = nombreCompleto;
        this.telefono = telefono;
        this.correo = correo;
        this.direccionResidencia = direccionResidencia;
        this.historialPedidos = historialPedidos;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccionResidencia() {
        return direccionResidencia;
    }

    public void setDireccionResidencia(String direccionResidencia) {
        this.direccionResidencia = direccionResidencia;
    }

    public List getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(List historialPedidos) {
        this.historialPedidos = historialPedidos;
    }
}
