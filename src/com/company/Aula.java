package com.company;

public class Aula implements Comparable<Aula>{
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo){
        this.titulo=titulo;
        this.tempo=tempo;
    }

    public int getTempo() {
        return tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Aula: " + titulo  +
                ", tempo: " + tempo;
    }

    public int compareTo(Aula aula){
        return this.titulo.compareTo(aula.getTitulo());
    }
}
