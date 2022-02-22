package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestandoListDeAulas {

    public static void main(String[] args) {
        ArrayList<Aula> aulas=new ArrayList<>();

        Aula aula1=new Aula("Começando com java", 10);
        Aula aula2=new Aula("Java Strings", 15);
        Aula aula3=new Aula("Spring API",30);

        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);

        System.out.println(aulas);

        Collections.sort(aulas); //utilizando o compare to criado la na class de aulas pra ordenar por titulo

        Collections.sort(aulas,Comparator.comparing(Aula::getTempo));
        //ordena a list pelo tempo, do menor pro maior usando a interface Comparator


    }
}
