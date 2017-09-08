package com.thread.practise.stoperr;

public class runner {
	
	public static void main(String[] args){
		SynchronizedObject synchronizedObject = new SynchronizedObject();
		ThreadExtends thread = new ThreadExtends(synchronizedObject);
		thread.start();
		try {
			thread.sleep(500);
			thread.stop();
			System.out.println(synchronizedObject.getUsername()+synchronizedObject.getPassword());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
