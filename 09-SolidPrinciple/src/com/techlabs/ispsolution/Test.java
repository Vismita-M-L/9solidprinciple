package com.techlabs.ispsolution;

import com.techlabs.ispviolation.IWorker;
import com.techlabs.ispviolation.Labour;
import com.techlabs.ispviolation.Robot;

public class Test {

	public static void main(String[] args) {
		IWorker work=new Labour();
		work.startWork();
		work.stopWork();
		work.eat();
		work.drink();
		
		Robot work1=new Robot();
		work1.startWork();
		work1.stopWork();
		

	}

}
