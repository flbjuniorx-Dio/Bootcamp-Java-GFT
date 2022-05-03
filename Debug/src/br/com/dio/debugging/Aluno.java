package br.com.dio.debugging;

public class Aluno {

    protected String nome;
    protected double nota;

    public Aluno(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        if (nota < 0 || nota > 10)
            System.out.println("Nota inválida: " + nota);
        else
            this.nota = nota;
    }
}
