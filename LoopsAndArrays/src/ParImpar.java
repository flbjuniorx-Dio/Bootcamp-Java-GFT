/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números
pares e ímpares.
 */

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int quantnumeros;
        int numero;
        int pares = 0, impares = 0;

        System.out.println("Digite a quantidade desejada: ");
        quantnumeros = sc.nextInt();

        for (int i = 1; i <= quantnumeros; i++) {
            System.out.println("Digite o " + i + "º número: ");
            numero = sc.nextInt();
            if (numero % 2 == 0)
                pares++;
            else
                impares++;
        }

        System.out.println("Foram digitados " + pares + " números pares e " + impares + " números ímpares.");

        sc.close();

    }

}
