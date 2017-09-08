package com.thread.practise.exetends;

public class ChildSyn extends ParentSyn{

	public synchronized void doSomething(String threadName){
		
		System.out.println(threadName+" child saying begin");
		super.doSomething(threadName);
		System.out.println(threadName+" child saying end");
	}
}
