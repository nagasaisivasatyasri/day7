package com.assignments;

public class MessageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Thread t=new Thread() {
	public void run(){
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Good Morning");
	}
};
Thread t1=new Thread() {
	public void run() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Hello");
			}
};
Thread t2=new Thread() {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("welcome");
		
	}
	
};
t.start();
t1.start();
t2.start();
	}

}
