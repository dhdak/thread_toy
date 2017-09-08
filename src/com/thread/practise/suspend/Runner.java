package com.thread.practise.suspend;

public class Runner {
	
	public static void main(String[] args){
		MyThread thread = new MyThread();
		thread.start();
		try{
			thread.sleep(2000);
			thread.suspend();
			System.out.println("A= "+System.currentTimeMillis()+" i= "+thread.getI());
			thread.sleep(2000);
			System.out.println("A= "+System.currentTimeMillis()+" i= "+thread.getI());
			thread.resume();
			thread.sleep(2000);
			System.out.println("B= "+System.currentTimeMillis()+" i= "+thread.getI());
			thread.sleep(2000);
			System.out.println("B= "+System.currentTimeMillis()+" i= "+thread.getI());
			thread.interrupt();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}

}
