package org.java.lesson.calculator;

public class Calculator {

	//Declaring variables
	
	private double num1;
	private double num2;
	
	
	//Constructor
	public Calculator(double num1, double num2) {
		
		
		setNum1(num1);
		setNum2(num2);
		
	}

	
	
	//Num 1
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}


	
	
	//Num 2
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
	
	
	//Other FUnctions
	public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double divide(double num1, double num2) throws Exception {
        if (num2 != 0) {
            return num1 / num2;
        } else {
        	throw new Exception("Non puoi dividere per 0");
        }
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }
	
}
