package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.Transportista;

public class TransportistaFede extends Transportista {

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double precio=-1;

        if (DistanciaManhattan.build().medir(origen,destino)>=0
                && DistanciaManhattan.build().medir(origen,destino)<11){
            precio=5;
        } else if (DistanciaManhattan.build().medir(origen,destino)>10
                && DistanciaManhattan.build().medir(origen,destino)<101) {
            precio=(peso*DistanciaManhattan.build().medir(origen,destino))/2;
        }else {
            throw new EnvioNoDisponibleException("Envío no disponible");
        }
        return precio;
    }
}
