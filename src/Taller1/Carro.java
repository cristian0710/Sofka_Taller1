package Taller1;
/**
 * Esta es la clase que representa un vehiculo
 * @author Cristian Duran M
 */
public class Carro {
    String brand;
    String model;
    String color;
    private boolean light;

    /**
     * Metodo constructor
     * @param brand
     * @param model
     * @param color
     * @param light
     */
    public Carro(String brand, String model, String color, boolean light) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.light = light;
    }

    /**
     * Metodo para ver si el carro esta encendido o apagado
     * @return
     */
    public boolean isLight() {
        return light;
    }

    /**
     * Metodo parra encender o apagar el carro
     * @param light
     */
    public void setLight(boolean light) {
        this.light = light;
    }
}
