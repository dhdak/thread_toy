package com.thread.practise.threadException;

/**
 * �߳��׳��쳣�����˳���ǰ�߳�
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
