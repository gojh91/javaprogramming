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
		System.out.println(Thread.currentThread().getName()+"������ ����");
		Thread t=new Thread(new MyThread());
		t.start();
		System.out.println("�����⸦ ��ٸ�");
		while (t.isAlive()) {
			tries++;
			System.out.println("waiting...");
			if(tries>2) {
				System.out.println("���� �� ����!");
				t.interrupt();
			}
			try {
				t.join(1000);
			} catch (InterruptedException e) {
				System.out.println("���ͷ�Ʈ �Ǿ��ٸ� �� �޽����� ����");
			}
		}
		System.out.println(Thread.currentThread().getName()+"������ ����");

	}
}
