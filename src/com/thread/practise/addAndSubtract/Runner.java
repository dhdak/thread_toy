package com.thread.practise.addAndSubtract;

/**
 * 起4个线程，两个进行加，两个进行减
 * @author weizh
 *
 */
public class Runner {
	
	public static void main(String[] args) throws InterruptedException{
		ShareObject shareObject = new ShareObject();
		AddThread addThread1 = new AddThread(shareObject);
		AddThread addThread2 = new AddThread(shareObject);
		SubtractThread subtractThread1 = new SubtractThread(shareObject);
		SubtractThread subtractThread2 = new SubtractThread(shareObject);
		addThread1.start();
		addThread2.start();
		subtractThread1.start();
		subtractThread2.start();
		Thread.sleep(1000);
		System.out.println("the i is: "+shareObject.i);
	}

}
