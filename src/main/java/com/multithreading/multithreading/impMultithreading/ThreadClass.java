package com.multithreading.multithreading.impMultithreading;

import java.sql.Time;

public class ThreadClass extends Thread {

	private int start;
	private int end;
	public ThreadClass(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		Time startTime = new Time(System.currentTimeMillis());
		for(int i = start; i<end; i++) {
			System.out.println("thread name is - " + Thread.currentThread().getName());
			System.out.println("Thread is running - " + i);
		}
		Time endTime = new Time(System.currentTimeMillis());
		System.out.println("Start time in milliseconds - " + startTime);
		System.out.println("End time in milliseconds - " + endTime);
		System.out.println("Total time taken in milliseconds - " + (endTime.getTime() - startTime.getTime()));
		
	}
	
	public static void main(String[] args) {
		ThreadClass threadClassObj1 = new ThreadClass(0, 1000);
		threadClassObj1.start();
		ThreadClass threadClassObj2 = new ThreadClass(1001,10000);
		threadClassObj2.start();
		ThreadClass threadClassObj3 = new ThreadClass(10001, 100000);
		threadClassObj3.start();
		ThreadClass threadClassObj4 = new ThreadClass(100001, 1000000);
		threadClassObj4.start();
//		ThreadClass threadClassObj5 = new ThreadClass();
//		threadClassObj5.start();
//		ThreadClass threadClassObj6 = new ThreadClass();
//		threadClassObj6.start();
	}

}
