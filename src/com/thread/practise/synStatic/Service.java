package com.thread.practise.synStatic;

public class Service {
	synchronized public static void printA() {

		try {
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get in method \"printA\"");
			Thread.sleep(1000);
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get out method \"printA\"");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	synchronized public static void printB() {

		try {
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get in method \"printB\"");
			Thread.sleep(1000);
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get out method \"printB\"");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	synchronized public void printC() {

		try {
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get in method \"printC\"");
			Thread.sleep(1000);
			System.out.println("Thread name is : " + Thread.currentThread().getName() + " at "+ System.currentTimeMillis() + " get out method \"printC\"");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
