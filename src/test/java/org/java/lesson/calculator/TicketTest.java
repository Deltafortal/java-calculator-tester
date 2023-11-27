package org.java.lesson.calculator;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TicketTest {

	
	private static Ticket ticket = null;
	static double standardPrice = 0;
	static int km = 0;
	static int age = -1;
	
	
	@BeforeAll
	public static void setup() throws Exception {
		
		ticket = new Ticket(standardPrice, km, age);
	}
	
	
	
	@Test
	public void testPriceAboveZero() throws Exception {
		
		assertThrows(Exception.class, () -> ticket.setStandard_price(standardPrice), "Eccezione attesa con prezzo uguale o minore a 0");
		
	}
	
	
	@Test
	public void testKmAboveZero() throws Exception {
	
		assertThrows(Exception.class, () -> ticket.setKm(km), "Eccezione attesa con KM uguale o minore a 0");
		
	}
	
	
	
	@Test
	public void testAgeIsPositive() throws Exception {
		
		
		
		assertThrows(Exception.class, () -> ticket.setAge(age), "Eccezione attesa con età minore di 0");
		
	}
	
}
