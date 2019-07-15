//2011335002
package java0920;

public class TelevisionTest {
	public static void main(String[] args) {
		Television tv=new Television();
		tv.setChannel(16);
		int ch=tv.getChannel();
		System.out.println("현재 채널 = " + ch);
	}
}
