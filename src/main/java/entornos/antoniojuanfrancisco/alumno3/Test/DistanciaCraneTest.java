package entornos.antoniojuanfrancisco.alumno3.Test;

import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.alumno3.DistanciaCrane;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DistanciaCraneTest {
    @Test
    public void testMedirMismaPosicion() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(0, 0);
        DistanciaCrane distancia = DistanciaCrane.build();
        assertEquals(0.0, distancia.medir(origen, destino));
    }

    @Test
    public void testMedirDistanciaHorizontal() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 0);
        DistanciaCrane distancia = DistanciaCrane.build();
        assertEquals(3.0, distancia.medir(origen, destino));
    }

    @Test
    public void testMedirDistanciaVertical() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(0, 4);
        DistanciaCrane distancia = DistanciaCrane.build();
        assertEquals(4.0, distancia.medir(origen, destino));
    }

    @Test
    public void testMedirDistanciaDiagonal() {
        Punto origen = new Punto(0, 0);
        Punto destino = new Punto(3, 4);
        DistanciaCrane distancia = DistanciaCrane.build();
        assertEquals(4.0, distancia.medir(origen, destino));
    }

    @Test
    public void testMedirDistanciaNegativa() {
        Punto origen = new Punto(-1, -1);
        Punto destino = new Punto(2, 2);
        DistanciaCrane distancia = DistanciaCrane.build();
        assertEquals(3.0, distancia.medir(origen, destino));
    }
}
