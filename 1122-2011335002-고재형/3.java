//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args) {
	TreeSet<String> fruit= new TreeSet<String>();
	fruit.add("���");
	fruit.add("����");
	fruit.add("��");
	fruit.add("����");
	fruit.add("�ٳ���");
	fruit.add("�ٳ���");
	System.out.println(fruit);
	System.out.println("ũ�� = " + fruit.size());
	
	String[] flower= {"���","����","��","����"};
	TreeSet<String> s = new TreeSet<String>();
	for(String a:flower)
		if(!s.add(a))
			System.out.println("�ߺ��� �ܾ� : " + a);
	s.add("�ٳ���");
	System.out.println(s);
	System.out.println("ũ�� = " + s.size());
	}
}
