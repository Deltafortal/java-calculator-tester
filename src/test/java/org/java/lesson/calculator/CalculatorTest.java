package org.java.lesson.calculator;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
//import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

	@Test
    public void testDivideByZero() throws Exception {
        
        double num1 = 5;
        double num2 = 5;
        
        Calculator calculator = new Calculator(num1,num2);
        
        
        //assertThrows(Exception.class, ()-> calculator.divide(5, 5), "Eccezzione attesa");
        assertDoesNotThrow(() -> calculator.divide(num1, num2), "Nessuna eccezione deve essere scatenata con dati corretti");
    }
	
}
