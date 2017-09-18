package com.thread.practise.synStatic;

public class ThreadC extends Thread{
	
	Service service;
	ThreadC(Service service){
		this.service = service;
	}
	@Override
	public void run(){
		service.printC();
	}

}
