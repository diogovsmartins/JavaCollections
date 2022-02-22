package com.company;

import java.util.List;

public class TestaListCurso {
    public static void main(String[] args) {
        Curso javaCollections=new Curso("Java Collections List, maps e hashmaps", "Paulo Silveira");

        List<Aula> aulas=javaCollections.getAulas();

        //javaCollections.getAulas().add(new Aula("Primeira aula de lists", 10));
        //não funciona mais pois no get aulas forçamos que o objeto devolvido é um objeto unmodifiable

        /*É uma boa pratica criar o metodo adiciona la na classe responsavel pela propria List, já que em orientação
        a objetos é uma boa pratica fazer com que somente o proprio objeto possa mudar seu estado e atributos*/

        javaCollections.adiciona(new Aula("Segunda aula de lists",20));
        javaCollections.adiciona(new Aula("terceira aula de lists",30));
        System.out.println(javaCollections);
    }
}
