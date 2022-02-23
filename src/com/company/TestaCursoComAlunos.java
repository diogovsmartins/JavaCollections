package com.company;

public class TestaCursoComAlunos {

    public static void main(String[] args) {
        Curso curso=new Curso("Maps, Hash e Lists", "Paulo Silveira");

        curso.adiciona(new Aula("Aula 1", 15));
        curso.adiciona(new Aula("Aula 1", 18));
        curso.adiciona(new Aula("Aula 1", 20));

        curso.matricula(new Aluno("José", 12345));
        curso.matricula(new Aluno("Roberto", 35123));
        curso.matricula(new Aluno("João", 63432));

        System.out.println(curso.getAlunosMatriculados());

        Aluno a1=new Aluno("Lucas", 12345);
        curso.matricula(a1);
        Aluno a2=new Aluno("Pedro", 123540);
        curso.matricula(a2);

        System.out.println("Aluno Lucas está matriculado?");
        System.out.println(curso.estaMatriculado(a1));

        System.out.println("A1 equals a2?");
        System.out.println(a1.equals(a2));

        System.out.println("a1==a2?");
        System.out.println(a1 == a2);

        Aluno a3=new Aluno("Lucas", 12314);

        System.out.println("a1 equals a3?");
        System.out.println(a1.equals(a3));

    }
}
