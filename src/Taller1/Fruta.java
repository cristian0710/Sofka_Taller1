package Taller1;

import java.util.ArrayList;

public class Fruta {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
