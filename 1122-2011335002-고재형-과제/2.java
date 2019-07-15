//2011335002
package test;

import java.awt.*;
import javax.swing.*;

public class CarGame extends JFrame{
	class MyThread extends Thread{
	private JLabel label;
	private int x,y;
	
	public MyThread(String fname, int x, int y) {
		this.x=x;
		this.y=y;
		label=new JLabel();
		label.setIcon(new ImageIcon(fname));
		label.setBounds(x,y,300,200);
		add(label);
	}
		public void run() {
			for (int i = 0; i < 200; i++) {
				x+=10*Math.random();
				label.setBounds(x,y,300,200);
				repaint();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e){
						e.getMessage();
					}
				}
			}
		}
	public CarGame() {
		setTitle("CarRace");
		setSize(700,650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		new MyThread("Images/car1.jpg", 50, 0).start();
		new MyThread("Images/car2.jpg", 50, 200).start();
		new MyThread("Images/car3.png", 50, 400).start();	
		setVisible(true);
	}
	public static void main(String[] args) {
	new CarGame();
	}
}
