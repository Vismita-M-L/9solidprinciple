package com.techlabs.dipsolution;

import com.techlabs.dip.DBLogger;

public class TaxCalculator {
	private ILogger logger;

	public TaxCalculator(DbLogger dbLogger) {
		
	}

	public ILogger getLogger() {
		return logger;
	}

	public void setLogger(ILogger logger) {
		this.logger = logger;
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
