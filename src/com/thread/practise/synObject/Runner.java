package com.thread.practise.synObject;

/**
 * synchronized(x),��ִ��x�е�synchronized����ʱ����ͬ��Ч��
 * @author weizh
 *
 */
public class Runner {
	
	public static void main(String[] args){
		Service service = new Service();
		MyObject object = new MyObject();
		ThreadA a = new ThreadA(service,object);
		ThreadB b = new ThreadB(object);
		a.setName("a");
		b.setName("b");
		a.setPriority(10);
		b.setPriority(1);
		a.start();
		b.start();
		
	}

}
