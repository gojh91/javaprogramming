//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		DataInputStream din = null;
		DataOutputStream dos= null;
		FileInputStream fis = null;
		FileOutputStream fos= null;
		try {
			fos = new FileOutputStream("data.bin");
			dos = new DataOutputStream(new BufferedOutputStream(fos));
			dos.writeDouble(3.14);
			dos.writeInt(100);
			dos.writeUTF("»ç°ú ¹Ù³ª³ª µþ±â Æ÷µµ ±Ö");
			dos.flush();
			
			fis=new FileInputStream("data.bin");
			din= new DataInputStream(new BufferedInputStream(fis));
			System.out.println(din.readDouble());
			System.out.println(din.readInt());
			System.out.println(din.readUTF());
		} finally {
			if(din != null) din.close();
			if(dos != null) dos.close();
		}
		
	}
}
