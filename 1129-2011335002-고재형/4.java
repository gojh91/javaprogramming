//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args)throws IOException{
		BufferedReader in=null;
		PrintWriter out =null;
		try {
			in = new BufferedReader(new FileReader("input.txt"));
			out = new PrintWriter(new FileWriter("output.txt"));
			String s;
			while((s=in.readLine())!=null) {
				out.println(s);
			}
		} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
