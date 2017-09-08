package com.thread.practise.methodLock;

public class ThreadA extends Thread{
	ShareLockObject shareLockObject;
	ThreadA(ShareLockObject shareLockObject){
		super();
		this.shareLockObject = shareLockObject;
	}
	@Override
	public void run(){
		super.run();
//		shareLockObject.synchronizedMethod();
		shareLockObject.asynchronizedMethod();
	}
}
