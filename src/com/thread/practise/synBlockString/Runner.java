package com.thread.practise.synBlockString;

public class Runner {
	
	public static void main(String[] args){
		Service service = new Service();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service);
		a.setName("A");
		b.setName("C");//aaa
		a.start();
		b.start();
	}

}
