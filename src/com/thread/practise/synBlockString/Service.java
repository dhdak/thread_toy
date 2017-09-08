package com.thread.practise.synBlockString;

public class Service {

	private String username;
	private String password;
	private String anyString = new String();
	
	public void setUsernamePassword(String username,String password){
		synchronized (anyString) {
			System.out.println("�߳�����"+Thread.currentThread().getName()+"��ʱ�䣺"+System.currentTimeMillis()+"����synchronized�����");
			this.username = username;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			this.password = password;
			System.out.println("�߳�����"+Thread.currentThread().getName()+"��ʱ�䣺"+System.currentTimeMillis()+"�뿪synchronized�����");
		}
	}
}
