import java.util.Scanner;

/*
Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usuário deve informar de qual numero ele deseja ver a tabuada.
A saída deve ser conforme o exemplo abaixo:
Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
*/

public class Tabuada {

    public static void calculaTabuada(int numero) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " X " + i + " = " + numero * i);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número desejado:");
        int numero = sc.nextInt();

        calculaTabuada(numero);

        sc.close();
    }

}
