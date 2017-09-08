package com.thread.practise;

public class Run {

	public static void main(String[] args){
		
		/**
		 * test synchronized
		 * begin
		 * */
//		MyThread myThread = new MyThread();
//		Thread a = new Thread(myThread,"a");
//		Thread b = new Thread(myThread,"b");
//		Thread c = new Thread(myThread,"c");
//		Thread d = new Thread(myThread,"d");
//		Thread e = new Thread(myThread,"e");
//		Thread f = new Thread(myThread,"f");
//		a.start();
//		b.start();
//		c.start();
//		d.start();
//		e.start();
//		f.start();
		//end
		
		/**
		 * test Thread.stop  暴力释放进程
		 * begin
		 * */
		try {
			ThreadStop threadStop = new ThreadStop();
			threadStop.start();
//			threadStop.sleep(4000);
//			threadStop.stop();
			threadStop.interrupt();
			System.out.println(threadStop.interrupted());
			System.out.println(threadStop.isInterrupted());
			System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().interrupted());
			System.out.println("end");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
}
