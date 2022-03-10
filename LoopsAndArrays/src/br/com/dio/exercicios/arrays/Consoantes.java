package br.com.dio.exercicios.arrays;
/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int total = 6, cont = 0;

        String letra;

        String[] consoantes = new String[total];

        for (int i = 0; i <= total - 1; i++) {
            System.out.println("Digite a " + (i + 1) + "ª letra: ");
            letra = sc.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u") )) {

                consoantes[i] = letra;
                cont++;
            }

        }

        for (String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + " ");
        }
        System.out.println("\n" + cont);
        sc.close();
    }





}
