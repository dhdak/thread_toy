package com.thread.practise.synObject;

public class Service {
	
	public void synMethod(MyObject object){
		synchronized(object){
			System.out.println("serviceMethod get lock time = "+System.currentTimeMillis() + " run thread name "+ Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("serviceMethod release lock time = "+System.currentTimeMillis() + " run thread name "+ Thread.currentThread().getName());
		}
	}

}
