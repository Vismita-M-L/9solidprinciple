package com.techlabs.ispviolation;

public class Labour  implements IWorker{
	public void startWork(){
		{
			System.out.println("Labour is Starting the work");
		}
	}
	public void stopWork()
	{
		System.out.println("Labour is Stopping the work");
		
	}
	public void eat()
	{
		System.out.println("Labour is eating");
		
	}
	public void drink()
	{
		System.out.println("Labour is drinking");
		
	}

}
