package ThreadMethods;
//import java.lang.*;
//import java.util.*;
public class ThreadEx1 {

	public static void main(String []args) {
		// TODO Auto-generated method stub
Thread1 t1=new Thread1();
Thread2 t2=new Thread2();
Thread3 t3=new Thread3();
Thread4 t4=new Thread4();
Thread t=new Thread(t3);
Thread t5=new Thread(t4);
Thread5 f=new Thread5();
Thread6 g=new Thread6();
//t.setPriority(10);
//t5.setPriority(7);
t1.start();
t2.start();
t.start();
t.suspend();
f.start();
g.start();
System.out.println("car3 had an accident while going to petrol pump");
t5.start();
g.suspend();
System.out.println("car6 had punctured while going to pitstop");

}}
class Thread1 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++) {
			if(i==1) {
			System.out.println("car1 reached petrol pump");}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==2) {
			//notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("car 1 reached pitstop");
		}
		//notify();
		if(i==3) {
		//System.out.println("car 4 won");
		System.out.println("Car1 won");}
		}
	}
}
class Thread2 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++) {
			
		if(i==1) {
		System.out.println("car 2 reached petrolpump");}
		try {
		Thread.sleep(1000);}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		if(i==2) {
			
		//notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		System.out.println("car 2 reached pitstop");}
		
		//System.out.println("car 4 won");
		if(i==3) {
		System.out.println("Car 2 won");}}
	}
}
class Thread3 implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			
		if(i==1) {
		Thread.yield();
		System.out.println("car 3 reached petrolpump");}
		if(i==2) {
		System.out.println("car 3 reached pitstop");}
		if(i==3) {
		System.out.println("car 3 won");}}
	}
}
class Thread4 implements Runnable
{
	public void run()
	{
		for(int i=1;i<=3;i++) {
			if(i==1) {
		//Thread.yield();
		System.out.println("car4 reached petrol pump");}
		try {
			
		Thread.sleep(1000);}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		if(i==2) {
			//notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//System.out.println("car 2 reached pitstop");
		System.out.println("car 4 reached pitstop");}
		if(i==3) {
		System.out.println("car 4 won");}}
	}
}
class Thread5 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++) {
			if(i==1) {
			System.out.println("car5 reached petrol pump");}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(i==2) {
			//notify();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//System.out.println("car 2 reached pitstop");
		System.out.println("car 5 reached pitstop");}
		//notify();
		if(i==3) {
		//System.out.println("car 4 won");
		System.out.println("Car5 won");}
		}
	}
}

class Thread6 extends Thread{
	public void run()
	{
		for(int i=1;i<=3;i++) {
			if(i==1) {
			System.out.println("car6 reached petrol pump");}
		if(i==2) {
		System.out.println("car 6 reached pitstop");}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//notify();
		if(i==3) {
		//System.out.println("car 4 won");
		System.out.println("Car 6 won");}
		}
	}
}