//2011335002
package java1122;

class Counter{
	private int value=0;
	public synchronized void increment() {value++;}
	public synchronized void decrement( ) {value--;}
	public synchronized void prn() {
		System.out.println(Thread.currentThread().getName()+":"+value);
	}
}
class MyThread extends Thread{
	Counter cnt;
	public MyThread(Counter c) {this.cnt=c;}
	public void run() {
		int i=0;
		while(i<20) {
			cnt.increment();
			cnt.decrement();
			cnt.prn();
			try {
				sleep((int)(Math.random()*2));
			} catch (InterruptedException e) {
				System.out.println("Interrupt µÇ¾úÀ½");
			}
				i++;
		}
	}
}


public class Test {
	public static void main(String[] args){
		Counter c =new Counter();
		new MyThread(c).start();
		new MyThread(c).start();
		new MyThread(c).start();
	}
}
