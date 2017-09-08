package com.thread.practise.synchronizedBlock;

public class ThreadB extends Thread{

	private Task task;
	
	ThreadB(Task task){
		this.task = task;
	}
	
	@Override
	public void run(){
		super.run();
		task.doLongTimeTask();
	}
}