package com.thread.practise.synStatic;

public class ThreadA extends Thread{
	
	Service service;
	ThreadA(Service service){
		this.service = service;
	}
	@Override
	public void run(){
		service.printA();
	}

}
