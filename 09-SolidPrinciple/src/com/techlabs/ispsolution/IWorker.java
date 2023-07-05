package com.techlabs.ispsolution;

public interface IWorker extends IWorkable,ILunch {
	public void startWork();
	public void stopWork();
	public void eat();
	public void drink();


}
