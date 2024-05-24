package entornos.antoniojuanfrancisco.alumno2;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.Transportista;

public class TransportistaFede extends Transportista {

    /**
     * Asigna los valores por defecto
     */
    public TransportistaFede() {
        super("Fede", "Marrón", new DistanciaManhattan());
    }

    /**
     * @author Francisco Javier Marín Álvarez
     * Este método calcula el precio del envío
     * @param origen Recibe el punto de origen
     * @param destino Recibe el punto de destino
     * @param peso Recibe el peso del paquete
     * @return Devuelve el precio del envio
     * @throws EnvioNoDisponibleException Esta excepcion indica que el envío no esta disponible
     */
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
