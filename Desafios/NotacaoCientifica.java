import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class NotacaoCientifica {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        NumberFormat numFormat = new DecimalFormat();

        Double N = leitor.nextDouble();
        long bits = Double.doubleToLongBits(N);

        if ((bits & 0x8000000000000000L) != 0)
            System.out.println(String.format("%6.4E",N));
        else
            System.out.println(String.format("+%6.4E",N));

        boolean negative = (bits & 0x8000000000000000L) != 0;
        long exponent = bits & 0x7ff0000000000000L;
        long mantissa = bits & 0x000fffffffffffffL;
        System.out.println("negative: " + negative);
        System.out.println("exponent: " + Double.longBitsToDouble(exponent));
        System.out.println("mantissa: " + Double.longBitsToDouble(mantissa));

        leitor.close();
    }

}