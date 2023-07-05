package com.techlabs.dipsolution;

public class Test {

	public static void main(String[] args) {
		TaxCalculator t1=new TaxCalculator(new DbLogger());
		t1.CalculateTax(1000, 0);
		
		t1.setLogger(new FileLogger());
		t1.CalculateTax(1000, 0);
		



	}

}
