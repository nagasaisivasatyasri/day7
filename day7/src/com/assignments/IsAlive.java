package com.assignments;

public class IsAlive {

	private static final Runnable String = null;

	public static void main(String[] args) {
		Runnable thread1 = null;
		// TODO Auto-generated method stub
		//ThreadGroup tg=new ThreadGroup();
		Thread t=new Thread(thread1) {
			public void run(){
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
				//System.out.println("welcome");
				
			}
		};
		t.setName("Thread1");
		t1.setName("Thread2");
		t2.setName("Thread3");
				t.start();
		t1.start();
		t1.suspend();
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Status of "+t.getName()+" Is "+t.isAlive());
		System.out.println("Status of "+t1.getName()+" Is "+t.isAlive());

		t2.start();
		
		System.out.println("Status of "+t2.getName()+" Is "+t2.isAlive());
	}

}
