package uniquindio.edu.co;
import uniquindio.edu.co.excepciones.DomicilioNoAceptadoException;
import java.math.BigDecimal;

public interface ServicioDomicilio {
    String nombre();
    boolean aceptaEntrega(double distanciaKm);
    BigDecimal calcularCosto(double distanciaKm) throws DomicilioNoAceptadoException;
}
