package com.thread.practise.methodLock;

public class Runner {
	
	/**
	 * ��ִ��ͬ��������synchronized�����������õ������ϵ���
	 * ���һ��������������synchronized����a,b��aִ��ʱ����һ���߳��޷�ִ��b
	 * ���ִ�е��Ƿ�ͬ������������Ҫ����
	 * 
	 */
	public static void main(String[] args){
		ShareLockObject shareLockObject = new ShareLockObject();
		ThreadA threadA = new ThreadA(shareLockObject);
		ThreadB threadB = new ThreadB(shareLockObject);
		threadA.setName("a");
		threadB.setName("b");
		threadA.start();
		threadB.start();
	}
	
}
