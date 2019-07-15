//2011335002
package java1122;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("MILK");
		list.add("BREAD");
		list.add(1, "BUTTER");
		list.add(2, "AGRAPE");
		list.add("APPLE");

		System.out.println(list);
		int idx1 = list.indexOf("APPLE");
		int idx2 = list.lastIndexOf("APPLE");
		System.out.println(idx1 + "," + idx2 + "\n");
		Iterator e = list.iterator();
		System.out.println(e.next());
		e.remove();
		System.out.println();
		String s;
		while (e.hasNext()) {
			s = (String) e.next();
			System.out.println(s);
		}
	}
}
