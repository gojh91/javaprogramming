//2011335002
package test;

import java.awt.Font;

import javax.swing.*;

public class Test extends JFrame{
	private JLabel label;
	
	class MyThread extends Thread{
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				label.setText(i+"");
			}
		}
	}
	public Test() {
		setTitle("카운트다운");
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		label=new JLabel("Start", JLabel.CENTER);
		label.setFont(new Font("Serif", Font.BOLD,50));
		add(label);
		new MyThread().start();
		setVisible(true);
	}
	public static void main(String[] args) {
	new Test();

	}

}
