import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double N;
        int resto;

        N = sc.nextDouble();

        resto = (int) (N * 100.0 + 0.5);
        int quociente = resto;

        System.out.println("NOTAS:");

        int[] notas = { 100, 50, 20, 10, 5, 2 };

        for (int nota : notas ) {
            quociente = resto / (nota * 100);
            System.out.println(quociente + " nota(s) de R$ " + nota + ".00");
            resto = resto % (nota * 100);
        }

        System.out.println("MOEDAS:");

        int[] moedas = {100, 50};

        for (int moeda : moedas ) {
            quociente = resto / moeda;
            System.out.printf("%d moeda(s) de R$ %.2f\n", quociente, (float)moeda/100);
            resto = resto % moeda;
        }

        System.out.println(resto + " moeda(s) de R$ 0.01");

        sc.close();
    }
}