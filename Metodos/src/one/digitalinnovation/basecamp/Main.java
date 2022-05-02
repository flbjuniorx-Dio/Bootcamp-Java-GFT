package one.digitalinnovation.basecamp;

public class Main {

    public static void main(String[] args) {

        // Calculadora
        System.out.println("Exercício calculadora");
        Calc.soma(3, 6);
        Calc.subtracao(9, 1.8);
        Calc.divisao(5, 2.5);
        Calc.multiplicacao(7,8);
        System.out.println();

        // Empréstimo
        System.out.println("Exercício empréstimo");

        double valorEmprestimo = 20000;
        int numeroParcelas = 12;

        double taxa = Emprestimo.calculaTaxa(numeroParcelas);
        double montante = Emprestimo.calculaMontante(valorEmprestimo, numeroParcelas);
        double parcela = Emprestimo.calculaParcela(montante, numeroParcelas);

        System.out.printf("Valor solicitado: R$ %.2f", valorEmprestimo);
        System.out.println();
        System.out.println("Prazo: " + numeroParcelas);
        System.out.printf("Taxa de Juros: %.2f %%", taxa);
        System.out.println();
        System.out.printf("Valor total: R$ %.2f", montante);
        System.out.println();
        System.out.printf("Valor parcela: %d x R$ %.2f", numeroParcelas, parcela);
        System.out.println();

        //Mensagem
        System.out.println("Exercício mensagens:");

        int Array[];
        Array = new int[4; 10; 20];

        System.out.println(Mensagem.retornaMensagem(3));
        System.out.println(Mensagem.retornaMensagem(15));
        System.out.println(Mensagem.retornaMensagem(10));
        System.out.println(Mensagem.retornaMensagem(10));

    }

}
