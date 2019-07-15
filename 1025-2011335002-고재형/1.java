//2011335002

package java1025;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

class MyFlowLayout extends JFrame {
	public MyFlowLayout() {
		setTitle("GridLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0, 3)); // 필요한 만큼의 행, 3개의 열
		add(new JButton("Button1"));
		add(new JButton("Button2"));
		add(new JButton("Button3"));
		add(new JButton("B4"));
		add(new JButton("Long Button5"));

		pack();

		setVisible(true);
	}
}

public class FlowLayoutTest {
	public static void main(String[] args) {
		MyFlowLayout f = new MyFlowLayout();
	}
}
