package com.thread.practise.synObject;

public class ThreadA extends Thread{
	
	Service service;
	MyObject object;
	ThreadA(Service service ,MyObject object){
		this.service = service;
		this.object = object;
	}
	
	@Override
	public void run(){
		super.run();
		service.synMethod(object);
	}

}
