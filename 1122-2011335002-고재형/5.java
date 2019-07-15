//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args)throws InterruptedException {
		int time=1;
		Queue<Integer> queue= new LinkedList<Integer>();
		
		for (int i = time; i <=10; i++) {
			queue.add(i);
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.remove()+" ");
			Thread.sleep(1000);
			
		}
	
	}
}
