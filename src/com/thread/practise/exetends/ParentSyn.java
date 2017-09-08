package com.thread.practise.exetends;

public class ParentSyn {
	
	public synchronized void doSomething(String threadName){
		System.out.println(threadName+" parent saying");
	}

}
