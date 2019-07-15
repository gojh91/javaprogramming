//2011335002

package java1011;

class Employee {
	private String name;
	private double salary;
	private static int count = 0;

	public Employee(String n, double s) {
		name = n;
		salary = s;
		count++;
	}

	public static int getCount() {
		return count;
	}

}

public class EmployeeTest {
	public static void main(String[] args) {
		Employee e1, e2, e3;
		e1 = new Employee("±èÃ¶¼ö", 35000);
		e2 = new Employee("ÃÖÃ¶¼ö", 50000);
		e3 = new Employee("±èÃ¶È£", 20000);

		int n = Employee.getCount();
		System.out.println("ÇöÀç Á÷¿ø ¼ö = " + n);
	}
}
