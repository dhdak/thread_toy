package com.thread.practise.addAndSubtract;

public class AddThread extends Thread{

	ShareObject shareObject;
	AddThread(ShareObject shareObject){
		this.shareObject = shareObject;
	}
	@Override
	public void run(){
		super.run();
		shareObject.addOne();
	}
}
