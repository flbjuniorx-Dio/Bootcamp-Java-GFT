import java.io.IOException;
import java.util.Scanner;

public class Pares {

    private static int n;

    public static void main(String[] args) throws IOException {

        Scanner leitor = new Scanner(System.in);

        n = leitor.nextInt();

        if (n <= 0) {
            leitor.close();
            throw new IOException("Entrada inválida");
        }

        for (int i = 1; i <= n; i++) {
            if (i%2 == 0) {
                System.out.println(i);
            }
        }

        leitor.close();

    }    
}
