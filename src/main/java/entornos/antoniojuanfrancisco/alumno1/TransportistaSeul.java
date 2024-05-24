package entornos.antoniojuanfrancisco.alumno1;

import entornos.antoniojuanfrancisco.EnvioNoDisponibleException;
import entornos.antoniojuanfrancisco.Punto;
import entornos.antoniojuanfrancisco.Transportista;
import entornos.antoniojuanfrancisco.alumno2.DistanciaManhattan;

public class TransportistaSeul extends Transportista {

    // Constructor que inicializa un TransportistaSeul con ciertos parámetros.
    public TransportistaSeul() {
        super("Seul", "Naranja", new DistanciaManhattan());
        // Llama al constructor de la clase base Transportista con la ciudad "Seul",
        // el color "Naranja" y una instancia de DistanciaManhattan.
    }

    @Override
    public double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException {
        double distancia = DistanciaEuclidea.build().medir(origen, destino);
        //Comprueba que el peso esté entre 0 y 5, y si es el caso devuelve la distancia por 1.2.
        if (peso >= 0 && peso <= 5) {
            return distancia * 1.20;
            //Si no se ha complido la condición anterior, comprueba que el peso esté entre 5 y 10,
            //devolviendo en tal caso la distancia por 2.4.
        } else if (peso > 5 && peso < 10) {
            return distancia * 2.40;
            //Si no cumple ninguna de las dos condiciones, muestra una excepción con mensaje.
        } else {
            throw new EnvioNoDisponibleException("El peso no está soportado.");
        }
    }
}

