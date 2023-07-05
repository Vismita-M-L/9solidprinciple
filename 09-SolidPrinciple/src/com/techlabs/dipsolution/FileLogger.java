package com.techlabs.dipsolution;

public class FileLogger implements ILogger {
	public void log(String error)
	{
		System.out.println("Logged database :"+error);
	}

}
