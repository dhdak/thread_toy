package com.thread.practise.synObject;

public class ThreadB extends Thread{
	
	MyObject object;
	ThreadB(MyObject object){
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		object.speedPrintString();
	}

}
