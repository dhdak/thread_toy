package com.thread.practise.synchronizedBlock;

/**
 * Í¬²½´úÂë¿é
 * synchronized(this)
 * @author weizh
 *
 */
public class Runner {

	public static void main(String[] args) {
		Task task = new Task();
		ThreadA a = new ThreadA(task);
		ThreadB b = new ThreadB(task);
		a.start();
		b.start();
	}
}
