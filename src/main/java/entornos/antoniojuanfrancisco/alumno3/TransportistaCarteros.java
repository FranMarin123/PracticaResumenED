package entornos.antoniojuanfrancisco.alumno3;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.Transportista;

public class TransportistaCarteros extends Transportista {

    public TransportistaCarteros() {
        super("Carteros", "Amarillo", new DistanciaCrane());
    }

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
