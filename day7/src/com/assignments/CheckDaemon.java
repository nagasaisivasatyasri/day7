package com.assignments;

public class CheckDaemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread() {
	public void run() {
		System.out.println("Thread1 running");
	}
};
Thread t1=new Thread() {
	public void run() {
		System.out.println("Thread2 running");
	}
};
t.setName("Thread1");
t1.setName("thread2");
t.setDaemon(true);
t1.setDaemon(false);
System.out.println(t.getName()+" is daemon "+t.isDaemon());
System.out.println(t1.getName()+" is daemon "+t1.isDaemon());

	}

}
