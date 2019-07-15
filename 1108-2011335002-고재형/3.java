//2011335002
package java1108;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
		private JButton button;
		private JLabel label;
		
		public MyFrame() {
			this.setSize(250,200);
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			this.setTitle("이벤트 예제");
			
			JPanel panel=new JPanel();
			panel.setLayout(new GridLayout(0,1));
			
			button=new JButton("버튼을 누르시오");
			button.addActionListener(this);
			panel.add(button);
			
			label=new JLabel("버튼이 눌려지지 않음",JLabel.CENTER);
			panel.add(label);
			
			this.add(panel);
			this.setVisible(true);
		}
			public void actionPerformed(ActionEvent e) {
				if(e.getSource()==button)
					label.setText("버튼이 눌러짐");
			}

		

		public static void main(String[] args) {
			MyFrame t=new MyFrame();
		}	}

