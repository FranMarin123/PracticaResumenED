package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.Punto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DistanciaManhattanTest {
    static DistanciaManhattan distanciaManhattan = new DistanciaManhattan();

    @Test
    @DisplayName("Distancias")
    void testMedir() {
        Assertions.assertEquals(0.0, distanciaManhattan.medir(new Punto(10.0, 10.0), new Punto(10.0, 10.0)));
        Assertions.assertEquals(20.0, distanciaManhattan.medir(new Punto(10.0, 10.0), new Punto(20.0, 20.0)));
    }
}