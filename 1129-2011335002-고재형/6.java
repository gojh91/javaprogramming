//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream file = new FileInputStream("korean.txt");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(file, "UTF-16"));
		
		String str;
		while ((str=in.readLine())!=null) 
			System.out.println(str);
	}
}
