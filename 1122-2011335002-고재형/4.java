//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Set<String> s1=new HashSet<String>();
		s1.add("���");
		s1.add("����");
		s1.add("����");
		
		Set<String> s2=new HashSet<String>();
		s2.add("���");
		s2.add("�ٳ���");
		
		Set<String> union=new HashSet<String>(s1);
		union.addAll(s2);
		
		Set<String> intersection=new HashSet<String>(s1);
		intersection.retainAll(s2);

		
	System.out.println("������ " + union);
	System.out.println("������ " + intersection);
	}
}
