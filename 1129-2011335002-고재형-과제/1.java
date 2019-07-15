//2011335002
package java1129;

import java.io.*;

class Buffer {
	private int data;
	private boolean empty = true;

	public synchronized int get() {
		while (empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = true;
		notifyAll();
		return data;
	}

	public synchronized void put(int data) {
		while (!empty) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		empty = false;
		this.data = data;
		notifyAll();
	}
}

class Producer implements Runnable {
	private Buffer buffer;

	public Producer(Buffer buffer) {
		this.buffer = buffer;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			buffer.put(i);
			System.out.println("생산자 :" + i + "번 케잌 생산");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {

			}
		}
	}
}

class Consumer implements Runnable {
	private Buffer buffer;

	public Consumer(Buffer drop) {
		this.buffer = drop;
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			int data = buffer.get();
			System.out.println("소비자 : " + data + "번 케잌 소비");
			try {
				Thread.sleep((int) (Math.random() * 1000));
			} catch (InterruptedException e) {

			}
		}
	}
}

public class Test {

	public static void main(String[] args){
		Buffer buffer=new Buffer();
		(new Thread(new Producer(buffer))).start();
		(new Thread(new Consumer(buffer))).start();

	}
}