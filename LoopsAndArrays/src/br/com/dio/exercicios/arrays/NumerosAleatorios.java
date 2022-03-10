package br.com.dio.exercicios.arrays;

/*
Faça um Programa que crie um vetor com 20 números inteiros aleatórios (entre 0 e 100).
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;

public class NumerosAleatorios {

    public static void main(String[] args) {

        Random random = new Random();

        // Instancia array de numeros inteiros com 20 posiçõe

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.println("Aleatórios:");
        for (int numero : numerosAleatorios ) {

            System.out.print(numero + " ");
        }

        System.out.println("\nSucessores:");
        for (int sucessor : numerosAleatorios ) {

            System.out.print(sucessor + 1 + " ");
        }
    }
}
