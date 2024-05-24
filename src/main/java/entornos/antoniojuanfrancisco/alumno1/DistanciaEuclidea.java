package entornos.antoniojuanfrancisco.alumno1;

import entornos.antoniojuanfrancisco.Distancia;
import entornos.antoniojuanfrancisco.Punto;

public class DistanciaEuclidea extends Distancia {

    @Override
    public double medir(Punto origen, Punto destino) {
        // Calcula la distancia euclidiana entre dos puntos.
        // La fórmula es sqrt((x2 - x1)^2 + (y2 - y1)^2).
        // Aquí está la fórmula corregida:
        return Math.sqrt(
                Math.pow(destino.getX() - origen.getX(), 2) + // Calcula (x2 - x1)^2
                        Math.pow(destino.getY() - origen.getY(), 2)   // Calcula (y2 - y1)^2
        );
    }

    public static DistanciaEuclidea build() {
        // Método estático para crear una nueva instancia de DistanciaEuclidea.
        return new DistanciaEuclidea();
    }
}

