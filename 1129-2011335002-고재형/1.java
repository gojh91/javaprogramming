//2011335002
package java1122;


class MyThread implements Runnable{
	public void run() {
		for (int i = 10; i >= 0; i--) {
			try {Thread.sleep(1000);}
			catch(InterruptedException e) {e.getMessage();}
			System.out.println(i);
		}
	}
}


public class Test {
	public static void main(String[] args){
		int tries=0;
		System.out.println(Thread.currentThread().getName()+"스레드 시작");
		Thread t=new Thread(new MyThread());
		t.start();
		System.out.println("끝나기를 기다림");
		while (t.isAlive()) {
			tries++;
			System.out.println("waiting...");
			if(tries>2) {
				System.out.println("참을 수 없음!");
				t.interrupt();
			}
			try {
				t.join(1000);
			} catch (InterruptedException e) {
				System.out.println("인터럽트 되었다면 이 메시지가 보임");
			}
		}
		System.out.println(Thread.currentThread().getName()+"스레드 종료");

	}
}
