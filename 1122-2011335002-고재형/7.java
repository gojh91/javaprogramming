//2011335002
package java1122;

import java.util.*;

public class Test {
	public static void main(String[] args){
	List<Integer> list = new ArrayList<Integer>();
	for (int i = 0; i < 10; i++) {
		list.add(i);
	}
	Collections.shuffle(list);
	System.out.println("list = " + list);
	Collections.sort(list);
	System.out.println("list = " + list);
	Collections.reverse(list);
	System.out.println("list = " + list);
	
	int key=5;
	int index= Collections.binarySearch(list, key);
	System.out.println(key + "ÀÇ ÀÎµ¦½º = " + index);
	}
}
