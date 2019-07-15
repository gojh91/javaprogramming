//2011335002
package java0920;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv=new Television();
		tv.channel=16;
		tv.volume=9;
		tv.onOff=true;
		tv.print();
		
		Television your_tv=new Television();
		your_tv.channel=24;
		your_tv.volume=8;
		your_tv.onOff=true;
		your_tv.print();
	}
}
