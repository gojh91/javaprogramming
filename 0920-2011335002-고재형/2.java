//2011335002
package java0920;

public class Ex02 {
	public static void main(String[] args) {
		
		System.out.println("\n숫자들의 합 : "+ sum(new int[] {1,2,3,4}) );
	}
	public static int sum(int[] numbers) {
		int total=0;
		for(int i=0; i<numbers.length;i++)
			total=total + numbers[i];
		System.out.print("배열 값 = ");
		for(int j=0; j<numbers.length;j++)
			System.out.print(numbers[j]+" ");
		return total;
	}
}
