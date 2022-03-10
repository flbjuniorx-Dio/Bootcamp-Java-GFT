package br.com.dio.exercicios.loops;/*
Faça um programa que calcule o fatorial de um número inteiro fornecido pelo usuário.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/

import java.util.Scanner;

public class Fatorial {

    public static int fatorial(int numero) {

        int multiplicador = 1;

        for (int i = numero; i >= 1; i--) {
            multiplicador *= i;
        }

        return multiplicador;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número desejado: ");
        int numero = sc.nextInt();

        System.out.println(numero + "! = " + fatorial(numero));

    }

}
