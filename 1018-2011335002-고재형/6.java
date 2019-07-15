//2011335002
package java1018;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Temperature extends JFrame{
	public Temperature() {
		JPanel panel = new JPanel();
		add(panel);
		
		JLabel label1=new JLabel("È­¾¾ ¿Âµµ");
		JLabel label2=new JLabel("¼·¾¾ ¿Âµµ");
		JTextField field1=new JTextField(15);
		JTextField field2=new JTextField(15);
		JButton button=new JButton("º¯È¯");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("¿Âµµº¯È¯±â");
		setVisible(true);
	}
}

public class TempTest {
	public static void main(String[] args) {
		Temperature f= new Temperature();
	}
}
