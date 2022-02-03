package Taller1;

import java.util.ArrayList;
/**
 * Esta es la clase que representa una fruta
 * @author Cristian Duran M
 */
public class Fruta {
    public String name;
    private float averageWeight;
    public ArrayList<String> colors;

    /**
     * Este es el constructor
     * @param name
     * @param averageWeight
     * @param colors
     */
    public Fruta(String name, float averageWeight, ArrayList<String> colors) {
        this.name = name;
        this.averageWeight = averageWeight;
        this.colors = colors;
    }

    /**
     * Metodo para obtener un arraylist de colores
     * @return
     */
    public ArrayList<String> getColors() {
        return colors;
    }

    /**
     * Metodo para insertar un arraylist de colores
     * @param colors
     */
    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }
}
