package com.thread.practise.synchronizedBlock;

public class Task {
	
	public void doLongTimeTask(){
		for(int i=0;i<100;i++){
			System.out.println("nosynochronized threadName = "+Thread.currentThread().getName()+" i= "+i);
		}
		
		synchronized (this){
			for(int i=0;i<100;i++){
				System.out.println("synochronized threadName = "+Thread.currentThread().getName()+" i= "+i);
			}
		}
	}

}
