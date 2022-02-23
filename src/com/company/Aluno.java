package com.company;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula){
        this.nome=nome;
        if(this.nome==null || this.nome.equals("")){
            throw new NullPointerException("Nome está null ou vazio");
        }
        this.matricula=matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "[ "+"Aluno:"+this.nome+
                ", Matricula: "+this.matricula+
                "]";
    }

    public boolean equals(Aluno o) {
        Aluno aluno= o;
        return this.nome.equals(aluno.nome);
    }

    @Override
    public int hashCode() {
        return this.nome.hashCode();
    }
}
