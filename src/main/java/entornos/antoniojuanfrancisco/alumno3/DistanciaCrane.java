package entornos.antoniojuanfrancisco.alumno3;

import entornos.antoniojuanfrancisco.Distancia;
import entornos.antoniojuanfrancisco.Punto;

public class DistanciaCrane extends Distancia {
    @Override
    public double medir(Punto origen, Punto destino) {
        return Math.max(Math.abs(destino.getX() - origen.getX()), Math.abs(destino.getY() - origen.getY()));
    }

    public static DistanciaCrane build(){
        return new DistanciaCrane();
    }
}
