package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.Distancia;
import entornos.antoniojuanfrancisco.Punto;

public class DistanciaManhattan extends Distancia {


    @Override
    public double medir(Punto origen, Punto destino) {
        return (destino.getX()- origen.getX())+(destino.getY())- origen.getY();
    }

    public static DistanciaManhattan build(){
        return new DistanciaManhattan();
    }
}
