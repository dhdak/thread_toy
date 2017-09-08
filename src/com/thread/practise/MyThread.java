package com.thread.practise;

public class MyThread extends Thread {
	int count = 5;

	@Override
	// synchronized public void run(){
	synchronized public void run() {
//		super.run();
		// count--;
		System.out.println(this.currentThread().getName() +"currentThread before isAlive=="+Thread.currentThread().isAlive());
		System.out.println(this.currentThread().getName() +"this before isAlive=="+this.isAlive());
		System.out.println("由" + this.currentThread().getName() + "计算所得count:" + count--);
		
		System.out.println(this.currentThread().getName() +" isAlive=="+this.isAlive());
	}
}
