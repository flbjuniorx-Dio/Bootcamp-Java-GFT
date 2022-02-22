package one.digitalinnovation.oo;

public class Main {

    public static void main(String[] args) {
        double valorCombustivel = 5.49;

        Carro mercedes = new Carro("SLA", "prata", 60);
    
        System.out.println("Modelo: " + mercedes.getModelo());
        System.out.println("Cor: " + mercedes.getCor());
        System.out.println("Capacidade do Tanque: " + mercedes.getCapacidadeTanque());
        System.out.printf("Valor total Tanque = %.2f", mercedes.totalValorTanque(valorCombustivel));
    }
}
