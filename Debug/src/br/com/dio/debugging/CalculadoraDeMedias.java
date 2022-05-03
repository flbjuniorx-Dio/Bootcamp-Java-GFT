package br.com.dio.debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] listaAlunos = {"Antonio", "Bernardo", "Caio", "David", "Eric"};

        Aluno[] alunos = preencheNotas(sc, listaAlunos);

        double media = calculaMediaTurma(alunos);

        System.out.printf("Média da turma = %.2f%n", media);

        sc.close();

    }

    private static Aluno[] preencheNotas(Scanner sc, String[] listaAlunos) {
        Aluno[] alunos = new Aluno[listaAlunos.length];

        for (int i = 0; i < alunos.length; i++) {
            alunos[i] = new Aluno(listaAlunos[i]);
            System.out.println("Digite a nota do aluno " + alunos[i].getNome());
            double nota = sc.nextDouble();
            alunos[i].setNota(nota);
        }
        return alunos;
    }

    public static double calculaMediaTurma(Aluno[] alunos) {
        Double soma = 0.0;
        Double media;

        for (int i = 0; i < alunos.length; i++) {
            soma += alunos[i].getNota();
        }

        media = soma / alunos.length;
        return media;
    }

}
