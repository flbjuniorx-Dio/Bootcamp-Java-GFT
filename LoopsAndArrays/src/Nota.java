import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int nota;

        System.out.println("Digite a nota: ");
        nota = sc.nextInt();

        while (nota < 0 || nota > 10) {
            System.out.println("Valor inválido, digite novamente:");
            nota = sc.nextInt();
        }

        System.out.println("Sua nota é: " + nota);

        sc.close();

    }

}
