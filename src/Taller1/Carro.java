package Taller1;

public class Carro {
    String brand;
    String model;
    String color;
    private boolean light;

    public Carro(String brand, String model, String color, boolean light) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.light = light;
    }

    public boolean isLight() {
        return light;
    }

    public void setLight(boolean light) {
        this.light = light;
    }
}
