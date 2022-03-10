package one.digitalinnovation.basecamp;

public class Emprestimo {

    public static double taxaJuros;
    public static double valorEmprestimo;
    public static int numeroParcelas;

    public static double calculaTaxa(int numeroParcelas) {

        if (numeroParcelas <= 12) {
            taxaJuros = 0.9f;
            return taxaJuros;
        } else if (numeroParcelas <= 24) {
            taxaJuros = 1.2f;
            return taxaJuros;
        } else {
            taxaJuros = 1.5f;
            return taxaJuros;
        }
    }

    public static double calculaMontante(double valorEmprestimo, int numeroParcelas) {

        double taxa = calculaTaxa(numeroParcelas);

        return valorEmprestimo * (Math.pow((1.0f + taxa/100), numeroParcelas));

    }

    public static double calculaParcela(double montante, int numeroParcelas) {

        return (montante / numeroParcelas);

    }

}
