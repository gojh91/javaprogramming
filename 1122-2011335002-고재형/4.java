//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		Set<String> s1=new HashSet<String>();
		s1.add("사과");
		s1.add("딸기");
		s1.add("포도");
		
		Set<String> s2=new HashSet<String>();
		s2.add("사과");
		s2.add("바나나");
		
		Set<String> union=new HashSet<String>(s1);
		union.addAll(s2);
		
		Set<String> intersection=new HashSet<String>(s1);
		intersection.retainAll(s2);

		
	System.out.println("합집합 " + union);
	System.out.println("교집합 " + intersection);
	}
}
