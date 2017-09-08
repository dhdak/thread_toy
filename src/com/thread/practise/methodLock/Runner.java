package com.thread.practise.methodLock;

public class Runner {
	
	/**
	 * 想执行同步方法（synchronized），必须先拿到对象上的锁
	 * 如果一个对象中有两个synchronized方法a,b，a执行时，另一个线程无法执行b
	 * 如果执行的是非同步方法，则不需要拿锁
	 * 
	 */
	public static void main(String[] args){
		ShareLockObject shareLockObject = new ShareLockObject();
		ThreadA threadA = new ThreadA(shareLockObject);
		ThreadB threadB = new ThreadB(shareLockObject);
		threadA.setName("a");
		threadB.setName("b");
		threadA.start();
		threadB.start();
	}
	
}
