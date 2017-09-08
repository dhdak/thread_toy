package com.thread.practise.methodLock;

public class ThreadB extends Thread{
	ShareLockObject shareLockObject;
	ThreadB(ShareLockObject shareLockObject){
		super();
		this.shareLockObject = shareLockObject;
	}
	@Override
	public void run(){
		super.run();
		shareLockObject.synchronizedMethod();
//		shareLockObject.asynchronizedMethod();
	}
}