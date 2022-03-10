/*
Faça um programa que leia 5 números
e informe o maior e calcule a média
 */

import java.util.Scanner;

public class MaiorEMedia<main> {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalNumeros = 5;
        int i = 1;

        double numero;
        double acumulador = 0;
        double maior = 0;
        double media;

        do {
            System.out.println("Digite o " + i + "º número: ");
            numero = sc.nextDouble();
            acumulador += numero;

            if (numero > maior)
                maior = numero;

            i++;
        } while ( i <= totalNumeros );

        media = acumulador / totalNumeros;
        System.out.println("Média = " + media);
        System.out.println("Maior = " + maior);

        sc.close();
    }

}
