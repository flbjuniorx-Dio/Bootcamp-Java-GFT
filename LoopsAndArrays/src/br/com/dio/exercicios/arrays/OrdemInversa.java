package br.com.dio.exercicios.arrays;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] vetor = {-5, -6, 15, 50, 8, 4};

        int cont = 0;
        System.out.println("Vetor: ");
        // Varredura do vetor na ordem direta
        while (cont < (vetor.length)) {
            System.out.print(vetor[cont] + " ");
            cont++;
        }

        System.out.println("\nVetor na ordem inversa: ");
        // Varredura do vetor na ordem inversa
        for (int i = (vetor.length - 1); i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}
