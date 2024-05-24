package entornos.antoniojuanfrancisco.alumno3.Test;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.alumno3.TransportistaCarteros;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertThrows;

/**
 * La clase TransportistaCarterosTest contiene pruebas unitarias para la clase TransportistaCarteros.
 * Cada método de prueba verifica un escenario diferente al calcular el presupuesto para un envío.
 */
public class TransportistaCarterosTest {

    /**
     * Prueba que se lance una excepción EnvioNoDisponibleException cuando el costo calculado es menor que 25 €.
     */
    @Test
    public void testPresupuestarCosteMinimo() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(1, 1);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertThrows(EnvioNoDisponibleException.class, () -> {
            transportista.presupuestar(origen, destino, 1);
        });
    }

    /**
     * Prueba que el costo calculado sea correcto cuando la distancia es mayor que el peso.
     *
     * @throws EnvioNoDisponibleException si ocurre un error al calcular el costo
     */
    @Test
    public void testPresupuestarDistanciaMayorQuePeso() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 3);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(27.0, transportista.presupuestar(origen, destino, 2));
    }

    /**
     * Prueba que el costo calculado sea correcto cuando el peso es mayor que la distancia.
     *
     * @throws EnvioNoDisponibleException si ocurre un error al calcular el costo
     */
    @Test
    public void testPresupuestarPesoMayorQueDistancia() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(1, 1);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(25.0, transportista.presupuestar(origen, destino, 12.5));
    }

    /**
     * Prueba que el costo calculado sea correcto cuando la distancia es igual al peso.
     *
     * @throws EnvioNoDisponibleException si ocurre un error al calcular el costo
     */
    @Test
    public void testPresupuestarDistanciaIgualAPeso() throws EnvioNoDisponibleException {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(2, 2);
        TransportistaCarteros transportista = new TransportistaCarteros();
        assertEquals(12, transportista.presupuestar(origen, destino, 6));
    }

    /**
     * Prueba que se lance una excepción EnvioNoDisponibleException cuando el costo calculado es menor que 25 €.
     */
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
