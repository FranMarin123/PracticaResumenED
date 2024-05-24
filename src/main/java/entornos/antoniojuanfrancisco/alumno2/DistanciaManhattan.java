package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.Distancia;
import entornos.antoniojuanfrancisco.Punto;

public class DistanciaManhattan extends Distancia {


    /**
     * @author Francisco Javier Marín
     * Este método sirve para saber la distancia de un punto a otro
     * @param origen Este es el punto de partida
     * @param destino Este es el punto de destino
     * @return Devuelve la distancia
     */
    @Override
    public double medir(Punto origen, Punto destino) {
        return (destino.getX()- origen.getX())+(destino.getY())- origen.getY();
    }

    public static DistanciaManhattan build(){
        return new DistanciaManhattan();
    }
}
