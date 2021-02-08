package ThreadMethods;

public class Customer {
	public static void main(String[] args) {
CustomerMain c=new CustomerMain();
Thread t1=new Thread() {
	public void run() {
		try {
			Thread.sleep(3000);
			c.withdraw(5000);
		}
		catch(InterruptedException e) {
		
			e.printStackTrace();
		}
	}
};
		Thread t2=new Thread() {
	public void run() {
		try {
			Thread.sleep(3000);
			c.deposit(5000);
		}
		catch(InterruptedException e) {
		
			e.printStackTrace();
		}
	}
};
t1.start();
t2.start();
	}
}
