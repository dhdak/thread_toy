package com.thread.practise.exetends;


/**
 * ÖØÈëËø
 * @author weizh
 *
 */
public class Runner {

	public static void main(String[] args) throws InterruptedException{
		ChildSyn childSyn = new ChildSyn();
		MyThread myThread1 = new MyThread(childSyn);
		myThread1.setName("myThread1");
		MyThread myThread2 = new MyThread(childSyn);
		myThread2.setName("myThread2");
		myThread1.start();
		myThread2.start();
	}
}
