package com.thread.practise;

public class RunnableRunner {
	
	public static void main(String[] args){
		RunableThread runableThread = new RunableThread();
		
		Thread thread = new Thread(runableThread);
		
		thread.start();
		
		System.out.println("end");
		
	}

}
