package ThreadMethods;

public class CustomerMain {
	 int balance=0;
synchronized void withdraw(int amount)
{
	if(balance>amount) {
		balance-=amount;
		System.out.println("Money got withdrawn directly....");
	}
	else {
		System.out.println("Wait till money get deposited....");
		try {
			wait();
			
			balance-=amount;
			System.out.println("Money got withdrawn after waiting "+balance);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
synchronized void deposit(int amount) {
	balance+=amount;
	System.out.println("amount deposited"+balance);
	notify();
}
}
