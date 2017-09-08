package com.thread.practise.threadException;

/**
 * 线程抛出异常，会退出当前线程
 * @author weizh
 *
 */
public class Runner {
	
	public static void main(String[] args){
		CreateExceptionService createExceptionService = new CreateExceptionService();
		
		ThreadA threada = new ThreadA(createExceptionService);
		ThreadB threadb = new ThreadB(createExceptionService);
		threada.setName("a");
		threadb.setName("b");
		threada.start();
		threadb.start();
	}

}
