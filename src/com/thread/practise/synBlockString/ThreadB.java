package com.thread.practise.synBlockString;

public class ThreadB extends Thread{
	
	Service service;
	ThreadB(Service service){
		this.service = service;
	}
	@Override
	public void run(){
		service.setUsernamePassword("b", "bb");
	}

}
