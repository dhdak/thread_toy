package com.thread.practise.threadException;

public class CreateExceptionService {
	
	synchronized public void method(){
		if("a".equals(Thread.currentThread().getName())){
			System.out.println("Thread name : "+Thread.currentThread().getName()+" begin time : "+System.currentTimeMillis());
			int i = 1;
			while(i==1){
				if("0.123456".equals((Math.random()+"").substring(0, 8))){
					System.out.println("Thread name : "+Thread.currentThread().getName()+" exception time : "+System.currentTimeMillis());
					Integer.parseInt("t");
				}
			}
		}else{
			System.out.println("Thread name : "+Thread.currentThread().getName()+" run time "+System.currentTimeMillis());
		}
	}

}
