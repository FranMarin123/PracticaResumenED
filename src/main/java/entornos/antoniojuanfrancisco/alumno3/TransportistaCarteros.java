package entornos.antoniojuanfrancisco.alumno3;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.Transportista;

/**
 * La clase TransportistaCarteros representa un transportista específico llamado "Carteros"
 * que utiliza la distancia de Chebyshev para calcular costos de envío.
 * <p>
 * Esta clase extiende la clase abstracta Transportista e implementa el método presupuestar.
 */
public class TransportistaCarteros extends Transportista {

    /**
     * Constructor por defecto que inicializa un transportista llamado "Carteros" con el color "Amarillo"
     * y una instancia de DistanciaCrane para medir distancias.
     */
    public TransportistaCarteros() {
        super("Carteros", "Amarillo", new DistanciaCrane());
    }

    /**
     * Calcula el costo de envío entre dos puntos dados basándose en la distancia de Chebyshev y el peso del envío.
     * Si el costo calculado es menor que 25 €, se lanza una excepción indicando que el envío no está disponible.
     *
     * @param origen el punto de origen del envío
     * @param destino el punto de destino del envío
     * @param peso el peso del envío
     * @return el costo del envío
     * @throws EnvioNoDisponibleException si el costo calculado es menor que 25 €
     */
    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double distancia = DistanciaCrane.build().medir(origen, destino);
        double coste;

        if (distancia > peso) {
            coste = distancia * 3;
        } else {
            coste = peso * 2;
        }

        if (coste < 25) {
            throw new EnvioNoDisponibleException("El servicio de envío debe tener un coste mínimo de 25 €.");
        }

        return coste;
    }
}
