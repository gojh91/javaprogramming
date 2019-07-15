//2011335002
package java1122;

import java.lang.reflect.Executable;
import java.util.*;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;


public class Test {
	public static void main(String[] args){
	Runnable r1 = () -> {
		for (int i = 10; i >= 0; i--) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	};
	Runnable r2 = () -> {
		for (int i = 10; i >= 0; i--) {
			System.out.println(Thread.currentThread().getName()+": "+i);
		}
	};
		Executor executor=Executors.newCachedThreadPool();
		executor.execute(r1);
		executor.execute(r2);
	}
}
