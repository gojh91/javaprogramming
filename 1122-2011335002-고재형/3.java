//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args) {
	TreeSet<String> fruit= new TreeSet<String>();
	fruit.add("사과");
	fruit.add("딸기");
	fruit.add("배");
	fruit.add("포도");
	fruit.add("바나나");
	fruit.add("바나나");
	System.out.println(fruit);
	System.out.println("크기 = " + fruit.size());
	
	String[] flower= {"사과","딸기","배","딸기"};
	TreeSet<String> s = new TreeSet<String>();
	for(String a:flower)
		if(!s.add(a))
			System.out.println("중복된 단어 : " + a);
	s.add("바나나");
	System.out.println(s);
	System.out.println("크기 = " + s.size());
	}
}
