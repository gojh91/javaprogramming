//2011335002
package java1115;

class Box<T>{
	private T data;
	public void set(T data) {this.data=data;}
	public T get() {return data;}
}

public class Test {
	public static void main(String[] args) {
		Box<String> b=new Box<String>();
		b.set("ÀÚ¹Ù");
		String s=b.get();
		System.out.println(s);
		Box<Integer> b2=new Box<Integer>();
		b2.set(10);
		Integer
		i=b2.get();
		System.out.println(i);
	}
}









