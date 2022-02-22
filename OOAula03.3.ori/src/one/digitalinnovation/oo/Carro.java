package one.digitalinnovation.oo;

/**
 * Classe exemplo para a Aula 2 de Orientação a Objetos.
 * 
 * Boa prática de organização do código
 * 1 - atributos
 * 2 - construtor(es)
 * 3 - getters/setters
 * 4 - métodos de negócio
 * 
 */

public class Carro {
    
    String modelo;
    String cor;
    int capacidadeTanque;
    
    // Construtor simples
    Carro() {
    }

    // Método sobrecarga
    Carro(String modelo, String cor, int capacidadeTanque) {
        this.modelo = modelo;
        this.cor = cor;
        this.capacidadeTanque = capacidadeTanque;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }
    public void setCapacidadeTanque(int capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double totalValorTanque(double valorCombustivel) {
        return capacidadeTanque * valorCombustivel;
    }

}