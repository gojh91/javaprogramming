//2011335002
package java0920;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv=new Television();
		tv.channel=16;
		tv.volume=9;
		tv.onOff=true;
		System.out.println("ä�� : "+ tv.channel);
		System.out.println("���� : "+ tv.volume );
		
		Television your_tv=new Television();
		your_tv.channel=24;
		your_tv.volume=8;
		your_tv.onOff=true;
		System.out.println("ä�� : "+ your_tv.channel);
		System.out.println("���� : "+ your_tv.volume );
	}
}
