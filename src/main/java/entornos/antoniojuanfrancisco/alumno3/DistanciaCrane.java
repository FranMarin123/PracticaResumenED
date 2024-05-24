package entornos.antoniojuanfrancisco.alumno3;

import entornos.antoniojuanfrancisco.Distancia;
import entornos.antoniojuanfrancisco.Punto;

/**
 * La clase DistanciaCrane mide la distancia entre dos puntos en un plano utilizando la
 * distancia de Chebyshev, que es la distancia máxima en una dimensión.
 *
 * Esta clase extiende la clase abstracta Distancia e implementa el método medir.
 * También proporciona un método estático para construir instancias de DistanciaCrane.
 */
public class DistanciaCrane extends Distancia {

    /**
     * Calcula la distancia de Chebyshev entre dos puntos dados.
     * La distancia de Chebyshev se define como la máxima diferencia absoluta
     * entre las coordenadas correspondientes de los puntos.
     *
     * @param origen el punto de origen
     * @param destino el punto de destino
     * @return la distancia de Chebyshev entre el origen y el destino
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.max(Math.abs(destino.getX() - origen.getX()), Math.abs(destino.getY() - origen.getY()));
    }

    /**
     * Crea y devuelve una nueva instancia de DistanciaCrane.
     *
     * @return una nueva instancia de DistanciaCrane
     */
    public static DistanciaCrane build(){
        return new DistanciaCrane();
    }
}
