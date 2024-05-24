package entornos.antoniojuanfrancisco;

public abstract class Transportista {
    private String nombre;
    private String color;
    private Distancia medida;

    protected Transportista(String nombre, String color, Distancia medida) {
        this.nombre = nombre;
        this.color = color;
        this.medida = medida;
    }

    public abstract double presupuestar(Punto origen, Punto destino, double peso) throws EnvioNoDisponibleException;
}

