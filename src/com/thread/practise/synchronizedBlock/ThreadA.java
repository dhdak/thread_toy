package com.thread.practise.synchronizedBlock;

public class ThreadA extends Thread{

	private Task task;
	
	ThreadA(Task task){
		this.task = task;
	}
	
	@Override
	public void run(){
		super.run();
		task.doLongTimeTask();
	}
}
