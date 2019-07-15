//2011335002
package java1025;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame extends JFrame{
	JButton b1,b2,b3;
	
	public MyFrame() {
	setTitle("Absolute Position");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,200);
	JPanel p=new JPanel();
	p.setLayout(null);
	
	b1=new JButton("Button1");
	p.add(b1);
	b2=new JButton("Button2");
	p.add(b2);
	b3=new JButton("Button3");
	p.add(b3);
	b1.setBounds(20,5,95,30);
	b2.setBounds(55,45,105,70);
	b3.setBounds(180,15,90,80);
	
	add(p);
	setVisible(true);
	}
}

public class AbsoluteTest {
	public static void main(String[] args) {
		MyFrame f= new MyFrame();
	}
}
