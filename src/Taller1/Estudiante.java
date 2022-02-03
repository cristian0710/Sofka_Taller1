package Taller1;

import java.util.Date;

public class Estudiante extends Persona{
    private String school;
    private String curse;
    private float note;

    public Estudiante(String name, String lastName, String lastName2, Date dateBirth, float height, String school, String curse) {
        super(name, lastName, lastName2, dateBirth, height);
        this.school = school;
        this.curse = curse;
    }

    public float finalNote(float n1, float n2,float n3){
        return this.note = (n1+n2+n3)/3;
    }

}
