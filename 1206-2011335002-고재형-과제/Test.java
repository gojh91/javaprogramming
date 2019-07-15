//2011335002

package java1206;

import java.util.ArrayList;
import java.util.Scanner;


class Animal {
	public void name() {
		System.out.println();
	}
	public void color() {
		System.out.println("색상: ");
	}
	public void specialty() {
		System.out.println("특기: ");
	}
	public void sound() {
		System.out.println("소리: ");
	}
	
	public void total() {
		
		this.name();
		this.color();
		this.specialty();
		this.sound();
	}	
}
class Dog extends Animal{
	
	private String name = "개";
	private String color = "Gold";
	private String specialty = "으르릉대며 물기";
	private String sound = "멍멍!";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("색상 : "+this.color);
	}
	public void specialty() {
		System.out.println("특기 : "+this.specialty);
	}
	public void sound() {
		System.out.println("소리 : "+this.sound);
	}
}
class Chicken extends Animal{
	
	private String name = "닭";
	private String color = "Red";
	private String specialty = "날아오르며 부리로 찍기";
	private String sound = "꼬끼오";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("색상 : "+this.color);
	}
	public void specialty() {
		System.out.println("특기 : "+this.specialty);
	}
	public void sound() {
		System.out.println("소리 : "+this.sound);
	}
}
class Cat extends Animal{
	
	private String name = "고양이";
	private String color = "Gray";
	private String specialty = "우아한 척하며 털 고르기";
	private String sound = "야옹";
	
	public void name() {
		System.out.println("<"+this.name+">");
	}
	public void color() {
		System.out.println("색상 : "+this.color);
	}
	public void specialty() {
		System.out.println("특기 : "+this.specialty);
	}
	public void sound() {
		System.out.println("소리 : "+this.sound);
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
			
			System.out.print("번호 선택: ");
			Scanner scan = new Scanner(System.in);
			num = scan.nextInt()-1;
			
			aniBox.get(num).total();
			System.out.println();
			System.out.println();
		}
	}
}
