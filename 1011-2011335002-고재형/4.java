//2011335002

package java1011;

class Time{
	private int hour;
	private int minute;
	private int second;
	
	public Time() {
		this(0,0,0);
	}
	public Time(int h, int m, int s) {
		hour=((h>=0&&h<24)?h:0);
		minute=((m>=0&&m<60)?m:0);
		second=((s>=0&&s<60)?s:0);
	}
	public String toString() {
		return String.format("%02d:%02d:%02d\n", hour, minute, second);
	}
}

public class TimeTest {
	public static void main(String args[]) {

		Time time1=new Time();
		Time time2=new Time(13,27,6);
		Time time3=new Time(99,66,77);
		System.out.println("기본 생성자 호출 후\n" + time1);
		System.out.println("정상 범위값 입력 후\n" + time2);
		System.out.println("정상 범위 외 입력 후\n" + time3);
	}

}
