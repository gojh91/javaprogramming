//2011335002
package java1115;

import java.util.Arrays;
import java.util.List;

public class Test{
	public static void printList(List<?> list) {
		for(Object o:list)
			System.out.print(o + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		List<Integer> li=Arrays.asList(1,2,3);
		List<String> ls=Arrays.asList("one","two","three");
		printList(li);
		printList(ls);
	}
}









