package com.techlabs.dipsolution;

public class DbLogger implements ILogger {
	public void log(String error)
	{
		System.out.println("Logged database :"+error);
	}

}
