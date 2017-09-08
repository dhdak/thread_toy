package com.thread.practise.synBlockString;

public class ThreadA extends Thread{
	
	Service service;
	ThreadA(Service service){
		this.service = service;
	}
	@Override
	public void run(){
		service.setUsernamePassword("a", "aa");
	}

}
