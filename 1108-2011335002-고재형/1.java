//2011335002
package java1108;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame{
		private JButton button;
		private JLabel label;
		
		public MyFrame() {
			this.setSize(250,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("�̺�Ʈ ����");
			
			JPanel panel=new JPanel();
			panel.setLayout(new GridLayout(0,1));
			
			button=new JButton("��ư�� �����ÿ�");
			button.addActionListener(new MyListener());
			panel.add(button);
			
			label=new JLabel("��ư�� �������� ����",JLabel.CENTER);
			panel.add(label);
			
			this.add(panel);
			this.setVisible(true);
		}
		
		public static void main(String[] args) {
			MyFrame t=new MyFrame();
		}	}

