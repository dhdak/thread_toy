package com.thread.practise.synStatic;

/**
 * 将synchronized加在static方法上和加在非static方法上
 * 获取到的时不同的锁，static上时获取class的锁，非static是对象锁
 * 所以，printc和其他两个方法不同步
 * 
 * class锁，对class的所有对象生效，所以，及时service，service0是不同的对象
 * 输出结果依旧同步
 * @author weizh
 *
 */
public class Runner {
	public static void main(String[] args){
		Service service = new Service();
		Service service0 = new Service();
		ThreadA a = new ThreadA(service);
		ThreadB b = new ThreadB(service0);
//		ThreadC c = new ThreadC(service);
		a.setName("A");
		b.setName("B");
//		c.setName("C");
		a.start();
		b.start();
//		c.start();
	}
	
}
