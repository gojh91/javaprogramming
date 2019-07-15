//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args)throws IOException{
		char[] buffer = new char[10];
		int data = 0;
		String msg="";
		InputStreamReader isr = new InputStreamReader(System.in);
		isr.read(buffer);
		msg= new String(buffer);
		System.out.println(msg);
		
		FileOutputStream file = new FileOutputStream("out.txt");
		OutputStreamWriter osw = new OutputStreamWriter(file);
		osw.write(msg);
		
		isr.close();
		osw.close();
		file.close();
		}
}
