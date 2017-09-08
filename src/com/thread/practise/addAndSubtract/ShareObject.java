package com.thread.practise.addAndSubtract;

public  class ShareObject {

	int i = 10;
	
	synchronized public void addOne(){
		i+=1;
		System.out.println("after add 1,the i is: "+i);
	}
	
	synchronized public void subOne(){
		i-=1;
		System.out.println("after sub 1,the i is: "+i);
	}
}
