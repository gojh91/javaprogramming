//2011335002
package java1115;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;

class MyException extends Exception{
	public MyException() {
		super("사용자 정의 예외");
	}
}

public class Test {
	public static void method() throws MyException {
			throw new MyException();
	}

	public static void main(String args[]) {
		try {
			method();
		} catch (MyException e) {
			System.err.println(e.getMessage());
		}
	}
}
