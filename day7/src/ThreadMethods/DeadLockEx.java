package ThreadMethods;

public class DeadLockEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
final String string="shiva";
final String str="kumar";
Thread t1=new Thread() {
	public void run() {
		synchronized(string)
		{
			System.out.println("Thread 1 :"+string);
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized(str)
			{
				System.out.println("Thread 1: locked"+str);
			}
		}
	}
};
Thread t2=new Thread() {
	public void run() {
		synchronized(str)
		{
			System.out.println("Thread 2 :"+str);
			try {
				Thread.sleep(1000);
				
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			synchronized(string)
			{
				System.out.println("Thread 2: locked"+string);
			}
		}
	}
};
t1.start();
t2.start();


	}

}
