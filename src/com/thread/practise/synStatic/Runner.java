package com.thread.practise.synStatic;

/**
 * ��synchronized����static�����Ϻͼ��ڷ�static������
 * ��ȡ����ʱ��ͬ������static��ʱ��ȡclass��������static�Ƕ�����
 * ���ԣ�printc����������������ͬ��
 * 
 * class������class�����ж�����Ч�����ԣ���ʱservice��service0�ǲ�ͬ�Ķ���
 * ����������ͬ��
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
