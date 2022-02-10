package com.dio.base;

/** 
 * Introdução ao Ecossistema e Documentacao Java
 * 
 * Modificadores de acesso:
 * - Public: qualquer classe de qualquer pacote podera acessar o metodo/atributo
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
 * 
 * Estruturas de repetição
 * - While
 * - Do...While
 * - For
 * - For each
 * 
 * Tags Javadoc: somente comentarios em bloco sao considerados.
 * - @author especifica o autor da classe/método
 * - @deprecated identifica classes/métodos obsoletos
 *   @see associa a outras classes/métodos
 * - @link URL para outro documento local ou remoto
 * - @param descreve o parâmetro a ser passado para o método
 * - @return descreve o retorno do método
 * - @since indica desde qual versão uma classe/método foi adicionado
 * - @throws descreve tipos de exceções que podem ser lançadas por um método
 * - @version versão da classe/método
 * 
 * PS C:\Users\flbju\Dio\Bootcamp-Java-GFT\Order> javadoc.exe -d javadoc -sourcepath .\src\ -subpackages com.dio
*/

public class Order {
	
	private final String code;
	private final Double totalValue;
	private Double fee = 10.0;

	private String[] items;

	/**
	 * Construtor da classe Order
	 * @param code			Código do pedido
	 * @param totalValue	Valor total (bruto)
	 */
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

	/** 
	 * Calcula e retorna o totalValue descontado de impostos
	 * @param fee					Taxa percentual de imposto
	 * @return totalValue			Valor total líquido de impostos
	 * @throws RuntimeException		Caso o valor do pedido seja negativo
	 */
	public double calculateFee() throws RuntimeException {

		if (this.totalValue < 0 ) {
			throw new RuntimeException("O valor do pedido nao pode ser negativo");
		}
		if (totalValue > 100) {
			return totalValue * (1 - (fee/100));
		} else {
			return totalValue;
		}
		
		/** 
		* switch (totalValue) {
		*	case 100:
		*		return totalValue * (1 - (fee/100));			
		*		break;
			case 200:
				return totalValue * (1 - ((fee + 1)/100);
		*	default:
		*		return totalValue;
		*		break;
		* 	}
		*/
	}

	public Double getFee() {
		if (this.totalValue > 100) {
			return this.fee = 10.0;
		} else {
			return this.fee = 0.0;
		}
	}

	public void printItems() {
		// int i = 0;
		// while (i < items.lenght) {
		// 	System.out.println(items[i]);
		// 	i++;
		// }
		
		// int i = 0;
		// do {
		// 	System.out.println(items[i]);
		// 	i++
		// } while (i < items.lenght);

		// for (int i = 0; i < items.lenght; i++) {
		// 	System.out.println(items[i]);
		// }

		for (String i : items) {
			System.out.println(i);
		}
	}

	public String getCode() {
		return code;
	}

	public double getTotalValue() {
		return totalValue;
	}

	
}
