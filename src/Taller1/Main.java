package Taller1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Persona per = new Persona();
        ArrayList<String> colores = new ArrayList();
        colores.add("rojo");
        colores.add("azul");
        Fruta fru = new Fruta("Mango", 8, colores);

        per.setName("Cristian");
        System.out.println(per.getName());
        System.out.println(fru.getColors());
    }
}
