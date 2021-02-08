package ThreadMethods;

public class SynchExUsingAnonymousClasses {

	public void printTable(int n)
	{
		synchronized(SynchExUsingAnonymousClasses.class) {
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		}
	}
	public static void main(String[] args) {
// TODO Auto-generated method stub
		SynchExUsingAnonymousClasses s=new SynchExUsingAnonymousClasses();
	
		Thread t1=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s.printTable(11);
			}});
		Thread t2=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				s.printTable(10);
			}});

			t1.start();
			t2.start();
			//Runnable r2=new Runnable() {
				
			}
		}

	


