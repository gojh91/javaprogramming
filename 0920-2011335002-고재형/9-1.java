//2011335002
package java0920;

public class Television {
		int channel;
		int volume;
		boolean onOff;
		
		void print() {
			System.out.println("ä�� : " + channel);
			System.out.println("���� : " + volume);
		}
		void setChannel(int ch) {
			channel=ch;
		}
		int getChannel() {
				return channel;
		}
}
