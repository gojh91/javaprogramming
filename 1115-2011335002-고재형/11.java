//2011335002
package java1115;

import java.util.Arrays;
import java.util.List;

public class Test{
	static double sumOfList(List<? extends Number> list) {
		double s=0.0;
		for(Number n:list)
			s+=n.doubleValue();
		return s;
	}

	public static void main(String[] args) {
		List<Integer> li1=Arrays.asList(1,2,3);
		System.out.println("sum = "+ sumOfList(li1));
		List<Double> li2=Arrays.asList(1.5, 2.5, 3.5);
		System.out.println("sum = "+ sumOfList(li2));
	}
}









