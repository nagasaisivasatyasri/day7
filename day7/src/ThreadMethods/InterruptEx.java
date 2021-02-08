package ThreadMethods;
import java.lang.*;
public class InterruptEx {

	public static void main(String	args[]) {
	Thread t1=new Thread(new Runnable() {	
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=5;i++) {
			if(Thread.interrupted()) {
				System.out.println("code is interrupted");
			}else {
				System.out.println("Code is running normally");
			}
			try {
				Thread.sleep(1000);
				System.out.println("this is thread 1:"+i);
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	});
	t1.start();
	t1.interrupt();
	}}
	
		
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
