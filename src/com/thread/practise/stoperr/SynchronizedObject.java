package com.thread.practise.stoperr;

public class SynchronizedObject {
	private String username = "a";
	private String password = "aaa";
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	synchronized void pringInfo(String username,String password){
//		System.out.println("username: "+username+"; password: "+password);
		
		try {
			this.username = username;
			Thread.sleep(3000);
			this.password = password;
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
