package com.thread.practise.synBlockString;

public class Service {

	private String username;
	private String password;
	private String anyString = new String();
	
	public void setUsernamePassword(String username,String password){
		synchronized (anyString) {
			System.out.println("线程名称"+Thread.currentThread().getName()+"在时间："+System.currentTimeMillis()+"进入synchronized代码块");
			this.username = username;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.password = password;
			System.out.println("线程名称"+Thread.currentThread().getName()+"在时间："+System.currentTimeMillis()+"离开synchronized代码块");
		}
	}
}
