//2011335002
package java1108;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KeyEventTest extends JFrame implements KeyListener{
	private JLabel label;
	private JTextField text;
	private JTextArea area;
	private JPanel panel;

	public KeyEventTest() {
		setSize(400, 200);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("KeyEvent Test");

		panel = new JPanel(new GridLayout(0,2));
		panel.setBackground(Color.yellow);
		label=new JLabel("문자를 입력하세요: ");
		text=new JTextField(10);
		panel.add(label);
		panel.add(text);
		
		area=new JTextArea(3,30);
		add(panel,BorderLayout.NORTH);
		add(area,BorderLayout.CENTER);
		
		text.addKeyListener(this);
		setVisible(true);
	}
	public void keyTyped(KeyEvent e) {
		display(e,"Key Typed  ");
	}
	public void keyPressed(KeyEvent e) {
		display(e,"Key Pressed  ");
	}
	public void keyReleased(KeyEvent e) {
		display(e,"Key Released  ");
	}
	protected void display(KeyEvent e, String s) {
		char c=e.getKeyChar();
		area.append(s+" " + c + "\n");
	}
		public static void main(String[] args) {
			new KeyEventTest();
		}
	}

