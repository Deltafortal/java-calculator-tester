package org.java.lesson.calculator;

public class Main {

	public static void main(String[] args) throws Exception {
		
		
		Calculator calculator = new Calculator(5, 5);

        double num1 = 5;
        double num2 = 5;

        System.out.println("Addizione: " + calculator.add(num1, num2));
        System.out.println("Sottrazione: " + calculator.subtract(num1, num2));
        System.out.println("Divisione: " + calculator.divide(num1, num2));
        System.out.println("Moltiplicazione: " + calculator.multiply(num1, num2));
		
	}
	
}
