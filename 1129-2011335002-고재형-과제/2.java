//2011335002
package java1129;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;



public class Test1 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("test.zip");
		ZipOutputStream zos=new ZipOutputStream(fos);
		
		int level=9;
		zos.setLevel(level);
		FileInputStream fin=new FileInputStream("input.txt");
		ZipEntry entry=new ZipEntry("input.txt");
		zos.putNextEntry(entry);
		for(int c=fin.read(); c!=-1; c=fin.read())
			zos.write(c);
		
		System.out.println(entry.getName()+"압축 완료");
		fin.close();
		zos.close();
	}
}
