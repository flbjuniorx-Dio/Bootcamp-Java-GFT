package br.com.dio.exercicios.arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9.
*/

import java.util.Random;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        Random random = new Random();

        int i = 1, j = 1;
        int size = 4;

        int[] linhas = new int[size];
        int[] colunas = new int[size];

        for (int linha = 1; linha == size; linha++) {

            for (int coluna = 1; coluna <= size; coluna ++) {
                linhas[i] = random.nextInt(9);
            }

        }
    }
}
