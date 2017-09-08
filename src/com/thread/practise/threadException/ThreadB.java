package com.thread.practise.threadException;

public class ThreadB extends Thread{
	
	CreateExceptionService createExceptionService;
	
	ThreadB(CreateExceptionService createExceptionService){
		this.createExceptionService = createExceptionService;
	}
	
	@Override
	public void run(){
		createExceptionService.method();
	}

}
