//2011335002
package java0920;

public class Ex05 {
	public static void main(String[] args) {
		
		System.out.println("�μ� ���� = "+ args.length);
		int sum=0;
		if(args.length>0) {
			for(int i=0;i<args.length;i++)
				sum=sum+Integer.parseInt(args[i]);
			System.out.println("���� ��� = "+ sum);
		}
	}
}
