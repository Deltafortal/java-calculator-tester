package org.java.lesson.calculator;

public class Ticket {

	//Declaring variables
	public double standard_price = 0.21; 
	public int under_age_sales = 20;
	public int over_65_sales = 40;
	public int km = 10;
	public int age = 20;
	
	
	//Constructor
	public Ticket(double standard_price, int km, int age) throws Exception {
		
		
		setStandard_price(standard_price);
		setKm(km);
		setAge(age);
		
	}


	
	
	//Price functions
	public double getStandard_price() {
		return standard_price;
	}

	public void setStandard_price(double standard_price) throws Exception {
		
		if(this.standard_price > 0) {
			
			this.standard_price = standard_price;
			
		} else {
			
			throw new Exception("il prezzo non può essere inferiore a 1");
			
		}
		
	}


	
	
	//km functions
	public int getKm() {
		return km;
	}
	public void setKm(int km) throws Exception {
		
		
		if(this.km > 0) {
			
			this.km = km;
			
		} else {
			
			throw new Exception("I km non possono essere inferiori a 1");
			
		}
		
	}


	
	
	
	//Age functions
	public int getAge() {
		return age;
	}
	public void setAge(int age) throws Exception {
		
		if(this.age >= 0) {
			
			this.age = age;
			
		} else {
			
			throw new Exception("l'età non può essere inferiore a 0");
			
		}

	}
	
	
	
}
