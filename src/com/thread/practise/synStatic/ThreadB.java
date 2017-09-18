package com.thread.practise.synStatic;

public class ThreadB extends Thread{
	
	Service service;
	ThreadB(Service service){
		this.service = service;
	}
	@Override
	public void run(){
		service.printB();
	}

}
