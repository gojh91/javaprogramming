package java1018;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Pizza extends JFrame{
	public Pizza() {
		setSize(500,150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.magenta);
		
		JPanel panelA=new JPanel();
		panelA.setBackground(Color.cyan);
		JLabel label1=new JLabel("자바 피자에 오신 것을 환영합니다.피자의 종류를 선택하시오.");
		panelA.add(label1);
		JPanel panelB=new JPanel();
		panelB.setBackground(Color.lightGray);
		JButton button1=new JButton("콤보피자");
		JButton button2=new JButton("포테이토피자");
		JButton button3=new JButton("불고기피자");
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);
		JLabel label2=new JLabel("개수");
		panelB.add(label2);
		JTextField field1=new JTextField(10);
		panelB.add(field1);
		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
}

public class PizzaTest {
	public static void main(String[] args) {
		Pizza f= new Pizza();
	}
}
