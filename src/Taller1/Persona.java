package Taller1;

import java.util.Date;

/**
 * Esta es la clase que representa a una persona
 * @author Cristian Duran M
 */
public class Persona {
    String name;
    String lastName;
    String lastName2;
    Date dateBirth;
    float height;

    /**
     * Este es el constructor
     * @param name
     * @param lastName
     * @param lastName2
     * @param dateBirth
     * @param height
     */
    public Persona(String name, String lastName, String lastName2, Date dateBirth, float height) {
        this.name = name;
        this.lastName = lastName;
        this.lastName2 = lastName2;
        this.dateBirth = dateBirth;
        this.height = height;
    }

    /**
     * Este es un constructor vacio
     */
    public Persona(){

    }

    /**
     * Metodo para obtener el nombre
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para insertar o modificar nombre
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
}
