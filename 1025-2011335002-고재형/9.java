//2011335002
package java1025;

interface Calcul{
	int exec(int a, int b);
}

public class LambdaTest {
public static void main(String[] args) {
	Calcul c1=(a, b) -> (a+b);
	int result1=c1.exec(2, 3);
	Calcul c2=(a, b) -> (a-b);
	int result2=c2.exec(2, 3);
	System.out.println("Че = " + result1);
	System.out.println("Тї = " + result2);
}
}
