//2011335002
package java1122;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
	List<Integer> list1=Arrays.asList(1,2,3);
	System.out.println(list1);
	List<String> list2=Arrays.asList("사과","배","딸기");
	System.out.println(list2);
	List<String> list=Arrays.asList(new String[3]);
	
	list.set(0, "국화");
	list.set(1, "장미");
	list.set(2, "백합");
	
	System.out.println(list);
	}
}
