package com.dio.base;

/** 
 * Introdução ao Ecossistema e Documentação Java
 * 
 * Modificadores de acesso:
 * - Public: qualquer classe de qualquer pacote poderá acessar o método/atributo
 * - Protected: acesso liberado para classes do mesmo pacote ou subclasse (default)
 * - Private: acesso liberado apenas para a própria classe
 * 
 * Métodos - funções que definem o comportamento de uma classe
 * - Construtores: definem como a classe será instanciada;
 * - Comuns: comportamentos atribuídos ou não à regra de negócio
 * 
 * Estrutura de condição - desvio do fluxo de execução
 * - If..Else: 
 * - Switch..Case:
*/

public class Order {
	
	private final String code;
	private final Double totalValue;
	private Double fee = 10.0;

	public Order(String code, Double totalValue) {
		this.code = code;
		this.totalValue = totalValue;
	}
	
	@Override
	public String toString() {
		return "Order={" + 
				"code:'" + code + "', " +
				"totalValue:'" + totalValue + "'" +
				"}";
	}

	public double calculateFee() {

		if (this.totalValue > 100) {
			return this.totalValue * (1 - (this.fee/100));
		} else {
			return this.totalValue;
		}
	}

	public Double getFee() {
		if (this.totalValue > 100) {
			return this.fee = 10.0;
		} else {
			return this.fee = 0.0;
		}
	}

	public String getCode() {
		return code;
	}

	public double getTotalValue() {
		return totalValue;
	}

	
}
