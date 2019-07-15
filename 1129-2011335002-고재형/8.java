//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		ObjectInputStream in =null;
		ObjectOutputStream out= null;
		
		String s1="»ç°ú"; String s2="µþ±â"; String s3="Æ÷µµ";
		String s4="¹è"; String s5="±Ö";
		String[] s = {s1,s2,s3,s4,s5};
		
		try {
			out = new ObjectOutputStream(new FileOutputStream("obj.dat"));
			out.writeObject(s1); out.writeObject(s2); out.writeObject(s3);
			out.writeObject(s4); out.writeObject(s5);
			out.flush();
			
			in = new ObjectInputStream(new FileInputStream("obj.dat"));
			for (int i = 0; i < s.length; i++) {
				s[i]=(String)in.readObject();
				System.out.println(s[i]);
			}
		}catch (ClassNotFoundException e) {
			} finally {
			if(in != null) in.close();
			if(out != null) out.close();
		}
	}
}
