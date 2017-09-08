package com.thread.practise;

public class ThreadStop extends Thread{
	
	private int i = 0;
	
	@Override
	public void run(){
		
		while(i<6){
			i++;
			System.out.println("i = "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
