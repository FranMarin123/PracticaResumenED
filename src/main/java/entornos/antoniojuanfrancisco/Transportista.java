package entornos.antoniojuanfrancisco;

public abstract class Transportista {
    private String nombre;
    private String color;
    private Distancia medida;

    public abstract double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException;
}

