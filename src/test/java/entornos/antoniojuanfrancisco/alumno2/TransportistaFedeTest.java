package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TransportistaFedeTest {
    static TransportistaFede transportistaFede = new TransportistaFede();

    @Test
    @DisplayName("Distancias")
    void testMedir() throws EnvioNoDisponibleException {
        Assertions.assertEquals(5, transportistaFede.presupuestar(new Punto(10.0, 10.0), new Punto(20.0, 10.0),20));
        Assertions.assertEquals(800, transportistaFede.presupuestar(new Punto(10.0, 10.0), new Punto(50, 50),20));
        EnvioNoDisponibleException thrown = assertThrows(EnvioNoDisponibleException.class, () -> {
            transportistaFede.presupuestar(new Punto(10.0, 10.0), new Punto(5000, 1000),20);
        });
    }
}