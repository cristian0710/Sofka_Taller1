package Taller1;

import java.util.Date;
/**
 * Esta es la clase estudiante que se extiende de persona
 * @author Cristian Duran M
 */
public class Estudiante extends Persona{
    private String school;
    private String curse;
    private float note;

    /**
     * Constructor de la clase estudiante que hereda los atributos de la clase padre
     * @param name
     * @param lastName
     * @param lastName2
     * @param dateBirth
     * @param height
     * @param school
     * @param curse
     */
    public Estudiante(String name, String lastName, String lastName2, Date dateBirth, float height, String school, String curse) {
        super(name, lastName, lastName2, dateBirth, height);
        this.school = school;
        this.curse = curse;
    }

    /**
     * Metodo para calcular la nota final del estudiante
     * @param n1
     * @param n2
     * @param n3
     * @return
     */
    public float finalNote(float n1, float n2,float n3){
        return this.note = (n1+n2+n3)/3;
    }

}
