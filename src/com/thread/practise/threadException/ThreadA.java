package com.thread.practise.threadException;

public class ThreadA extends Thread{
	
	CreateExceptionService createExceptionService;
	
	ThreadA(CreateExceptionService createExceptionService){
		this.createExceptionService = createExceptionService;
	}
	
	@Override
	public void run(){
		createExceptionService.method();
	}

}
