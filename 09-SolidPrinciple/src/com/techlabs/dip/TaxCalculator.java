package com.techlabs.dip;

public class TaxCalculator {
	private DBLogger dblogger;

	public TaxCalculator() {
		
	}
	public void CalculateTax(int amount,int rate)
	{
		int tax=0;
		try
		{
			tax=amount/rate;
			System.out.println(tax);
		}
		catch(Exception e)
		{
			new DBLogger().log("Divide by zero");
		}
	}
	
	
	
	
	

}
