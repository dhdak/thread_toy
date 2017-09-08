package com.thread.practise.exetends;

public class MyThread extends Thread{
	
	ChildSyn childSyn ;
	
	MyThread(ChildSyn childSyn){
		this.childSyn = childSyn;
	}
	
	@Override
	public void run(){
		System.out.println(Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		childSyn.doSomething(Thread.currentThread().getName());
	}

}
