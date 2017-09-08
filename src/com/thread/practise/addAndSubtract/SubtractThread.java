package com.thread.practise.addAndSubtract;

public class SubtractThread extends Thread{
	ShareObject shareObject;
	SubtractThread(ShareObject shareObject){
		this.shareObject = shareObject;
	}
	@Override
	public void run(){
		super.run();
		shareObject.subOne();;
	}
}
