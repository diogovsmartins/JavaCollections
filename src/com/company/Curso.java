package com.company;

import java.util.*;
import java.util.HashSet;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas=new LinkedList<>();
    private HashSet<Aluno> alunosMatriculados=new HashSet<>();

    public Curso(String nome, String instrutor){
        this.nome=nome;
        this.instrutor=instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adiciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal() {
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return"[" +"Nome do curso: "+this.nome+
                ", Instrutor: "+this.instrutor+
                ", tempo total do curso: "+
                getTempoTotal()+" ]";
    }

    public void matricula(Aluno aluno){
        alunosMatriculados.add(aluno);
    }

    public Set<Aluno> getAlunosMatriculados(){
        return Collections.unmodifiableSet(alunosMatriculados);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunosMatriculados.contains(aluno);
    }




}
