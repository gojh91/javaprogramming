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
		
		JLabel label1=new JLabel("ȭ�� �µ�");
		JLabel label2=new JLabel("���� �µ�");
		JTextField field1=new JTextField(15);
		JTextField field2=new JTextField(15);
		JButton button=new JButton("��ȯ");
		
		panel.add(label1);
		panel.add(field1);
		panel.add(label2);
		panel.add(field2);
		panel.add(button);
		
		setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("�µ���ȯ��");
		setVisible(true);
	}
}

public class TempTest {
	public static void main(String[] args) {
		Temperature f= new Temperature();
	}
}
