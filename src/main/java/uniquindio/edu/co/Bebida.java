package uniquindio.edu.co;

import uniquindio.edu.co.Enums.TipoBebida;

public class Bebida extends Producto {
    private int VolumenML;
    private double temperaturaServicio;
    private TipoBebida tipoBebida;
    private boolean requierePreparacionEspecial;

    public Bebida(String codigo, String nombre, String descripcion, double precioBase, int tiempoPreparacionMinutos, int volumenML, double temperaturaServicio, TipoBebida tipoBebida, boolean requierePreparacionEspecial) {
        super(codigo, nombre, descripcion, precioBase, tiempoPreparacionMinutos);
        VolumenML = volumenML;
        this.temperaturaServicio = temperaturaServicio;
        this.tipoBebida = tipoBebida;
        this.requierePreparacionEspecial = requierePreparacionEspecial;
    }

    public boolean isRequierePreparacionEspecial() {
        return requierePreparacionEspecial;
    }

    public void setRequierePreparacionEspecial(boolean requierePreparacionEspecial) {
        this.requierePreparacionEspecial = requierePreparacionEspecial;
    }

    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }

    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }

    public double getTemperaturaServicio() {
        return temperaturaServicio;
    }

    public void setTemperaturaServicio(double temperaturaServicio) {
        this.temperaturaServicio = temperaturaServicio;
    }

    public int getVolumenML() {
        return VolumenML;
    }

    public void setVolumenML(int volumenML) {
        VolumenML = volumenML;
    }
}
