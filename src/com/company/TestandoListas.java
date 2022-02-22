package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

    public static void main(String[] args) {
	    String curso1="Java JDBC";
        String curso2="Java Herança e Polimorfismo";
        String curso3="Java io";

        ArrayList<String> cursos=new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);

        System.out.println(cursos);

        //cursos.remove(0);

        System.out.println("O primeiro curso é: "+cursos.get(0));
        Collections.sort(cursos);
        cursos.forEach(curso->{
            System.out.println("Curso: "+curso);
        });
    }
}
