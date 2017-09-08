package com.thread.practise.stoperr;

public class ThreadExtends extends Thread{
	
	private SynchronizedObject synchronizedObject;
	
	ThreadExtends(SynchronizedObject synchronizedObject){
		this.synchronizedObject = synchronizedObject;
	}
	
	@Override
	public void run(){
		super.run();
		synchronizedObject.pringInfo("b", "bbb");
	}

}
