package com.company;

import java.util.Set;

public class HashSet {
    public static void main(String[] args) {
        Set<String> alunos=new java.util.HashSet();

        for (int i=0; i<10;i++){
            alunos.add("Aluno "+ i);
        }
        System.out.println(alunos);

        alunos.remove("Aluno 0");

        System.out.println(alunos);

        System.out.println(alunos.contains("Aluno 6"));


    }
}
