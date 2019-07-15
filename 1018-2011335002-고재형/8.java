//2011335002

package java1018;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFlowLayout extends JFrame{
	public MyFlowLayout() {
		setSize(700,500);
		setTitle("FlowLayoutTest");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel.add(new JButton("Button1"));
		panel.add(new JButton("Button2"));
		panel.add(new JButton("Button3"));
		panel.add(new JButton("B4"));
		panel.add(new JButton("Long Button5"));
		add(panel);
		
		setVisible(true);
	}
}

public class FlowLayoutTest {
	public static void main(String[] args) {
		MyFlowLayout f= new MyFlowLayout();
	}
}
