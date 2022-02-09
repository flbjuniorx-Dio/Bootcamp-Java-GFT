package com.dio;

import com.dio.base.Order;

public class MyFirstProgram {

	public static void main(String[] args) {
		String code = "code1234";
		double totalValue = 1000.00;

		Order order = new Order(code, totalValue);
		System.out.println(order);	// Invoca o método toString (sobrescrito)
		System.out.println("Code = " + order.getCode());	// getter(code)
		System.out.println("Total Value = " + order.getTotalValue());	// getter(totalValue)
		System.out.println("Fee = " + order.getFee() + " %");
		System.out.println("Total = " + order.calculateFee());	// método calculateFee
	}



}
