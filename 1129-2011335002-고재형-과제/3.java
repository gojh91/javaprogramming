//2011335002
package java1129;

import java.io.*;

public class Test {
	public static void main(String[] args) throws IOException {
		File dir = new File("F:/java");
		String[] fileNames= dir.list();
		
		for (String s : fileNames) {
			File f = new File("F:/java/" + s);
			System.out.println("�̸�: " + f.getName());
			System.out.println("���: " + f.getPath());
			System.out.println("�θ�: " + f.getParent());
			System.out.println("������: " + f.getAbsolutePath());
			System.out.println("���԰��: " + f.getCanonicalPath());
			System.out.println("���丮 ����: " + f.isDirectory());
			System.out.println("���� ����: " + f.isFile());
			System.out.println("----------------");
		}

	}
}
