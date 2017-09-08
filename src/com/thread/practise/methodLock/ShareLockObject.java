package com.thread.practise.methodLock;

public class ShareLockObject {
	
	synchronized public void asynchronizedMethod(){
		System.out.println("begin asynchronizedMethod,threadName : "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("asynchronizedMethod threadName : "+Thread.currentThread().getName()+" end time : "+System.currentTimeMillis());
	}
	
	synchronized public void synchronizedMethod(){
		System.out.println("begin synchronizedMethod,threadName : "+Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("synchronizedMethod threadName : "+Thread.currentThread().getName()+" end time : "+System.currentTimeMillis());
	}

}
