package com.techlabs.ispviolation;

public class IWorkerTest {

	public static void main(String[] args) {
		IWorker work=new Labour();
		work.startWork();
		work.stopWork();
		work.eat();
		work.drink();
		
		IWorker work1=new Robot();
		work1.startWork();
		work1.stopWork();
		work1.eat();
		work1.drink();
		
		

	}

}
