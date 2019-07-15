//2011335002
package java0920;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv=new Television();
		tv.channel=16;
		tv.volume=9;
		tv.onOff=true;
		System.out.println("Ã¤³Î : "+ tv.channel);
		System.out.println("º¼·ý : "+ tv.volume );
		
		Television your_tv=new Television();
		your_tv.channel=24;
		your_tv.volume=8;
		your_tv.onOff=true;
		System.out.println("Ã¤³Î : "+ your_tv.channel);
		System.out.println("º¼·ý : "+ your_tv.volume );
	}
}
