//2011335002

package java1206;

import java.util.ArrayList;
import java.util.Scanner;


class Animal {
	public void name() {
		System.out.println();
	}
	public void color() {
		System.out.println("����: ");
	}
	public void specialty() {
		System.out.println("Ư��: ");
	}
	public void sound() {
		System.out.println("�Ҹ�: ");
	}
	
	public void total() {
		
		this.name();
		this.color();
		this.specialty();
		this.sound();
	}	
}
class Dog extends Animal{
	
	private String name = "��";
	private String color = "Gold";
	private String specialty = "��������� ����";
	private String sound = "�۸�!";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("���� : "+this.color);
	}
	public void specialty() {
		System.out.println("Ư�� : "+this.specialty);
	}
	public void sound() {
		System.out.println("�Ҹ� : "+this.sound);
	}
}
class Chicken extends Animal{
	
	private String name = "��";
	private String color = "Red";
	private String specialty = "���ƿ����� �θ��� ���";
	private String sound = "������";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("���� : "+this.color);
	}
	public void specialty() {
		System.out.println("Ư�� : "+this.specialty);
	}
	public void sound() {
		System.out.println("�Ҹ� : "+this.sound);
	}
}
class Cat extends Animal{
	
	private String name = "�����";
	private String color = "Gray";
	private String specialty = "����� ô�ϸ� �� ����";
	private String sound = "�߿�";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("���� : "+this.color);
	}
	public void specialty() {
		System.out.println("Ư�� : "+this.specialty);
	}
	public void sound() {
		System.out.println("�Ҹ� : "+this.sound);
	}		
}

public class Test {
	public static void main(String[] args) {
		int num;
		
		ArrayList<Animal> aniBox = new ArrayList<Animal>();
		aniBox.add(new Dog());
		aniBox.add(new Chicken());
		aniBox.add(new Cat());
		
		while(true) {
			
			System.out.print("��ȣ ����: ");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt()-1;
			
			aniBox.get(num).total();
			System.out.println();
			System.out.println();
		}
	}
}
