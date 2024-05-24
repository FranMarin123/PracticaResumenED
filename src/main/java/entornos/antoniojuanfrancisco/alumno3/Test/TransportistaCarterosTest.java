package entornos.antoniojuanfrancisco.alumno3.Test;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.alumno3.TransportistaCarteros;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

public class TransportistaCarterosTest {
    @Test
    public void testPresupuestarCosteMinimo() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(1, 1);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertThrows(EnvioNoDisponibleException.class, () -> {
            transportista.presupuestar(origen, destino, 1);
        });
    }

    @Test
    public void testPresupuestarDistanciaMayorQuePeso() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 3);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(27.0, transportista.presupuestar(origen, destino, 2));
    }

    @Test
    public void testPresupuestarPesoMayorQueDistancia() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(1, 1);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(25.0, transportista.presupuestar(origen, destino, 12.5));
    }

    @Test
    public void testPresupuestarDistanciaIgualAPeso() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(2, 2);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(12, transportista.presupuestar(origen, destino, 6));
    }

    @Test
    public void testPresupuestarConEnvioNoDisponible() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(1, 1);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertThrows(EnvioNoDisponibleException.class, () -> {
            transportista.presupuestar(origen, destino, 10);
        });
    }
}
