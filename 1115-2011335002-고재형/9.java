//2011335002
package java1115;

class MyArray{
	public static <T> void swap(T[] a, int i, int j) {
		T tmp=a[i];
		a[i]=a[j];
		a[j]=tmp;
	}
}

public class Test {
	public static void main(String[] args) {
		String[] language= {"C++","C#","JAVA"};
		MyArray.swap(language,1,2);
		for(String value:language)
		System.out.println(value);
	}
}









