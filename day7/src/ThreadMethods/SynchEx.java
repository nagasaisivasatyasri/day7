package ThreadMethods;

public class SynchEx extends Thread {
NumberTable nt;

public SynchEx(NumberTable nt) {
	//super();
	this.nt = nt;
}
public void run() {
	nt.printTable(11);
}
}
 class SynchEx1 extends Thread {
NumberTable nt;

public SynchEx1(NumberTable nt) {
	//super();
	this.nt = nt;
}
public void run() {
	nt.printTable(10);
}
}
 class MainTable
 {
	 public static void main(String []args) {
	 NumberTable t=new NumberTable();
	 SynchEx se=new SynchEx(t);
	 SynchEx1 se1=new SynchEx1(t);
	 se.start();
	 se1.start();
 }
 }

