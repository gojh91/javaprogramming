//2011335002
package java1108;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	private JButton btnYellow;
	private JButton btnPink;
	private JButton btnBlue;
	private JPanel panel;
	private JLabel label;

	public MyFrame() {
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("2011335002 고재형");
		
		panel = new JPanel();
		panel.setLayout(new GridLayout(4,1));
		btnYellow = new JButton("노란색");
		btnYellow.addActionListener(new MyListener());
		panel.add(btnYellow);
		btnPink = new JButton("핑크색");
		btnPink.addActionListener(new MyListener());
		panel.add(btnPink);
		btnBlue = new JButton("파랑색");
		btnBlue.addActionListener(new MyListener());
		panel.add(btnBlue);
		
		label=new JLabel("버튼이 눌려지지 않음", JLabel.CENTER);
		panel.add(label);
		
		add(panel);
		setVisible(true);
	}
	

	class MyListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == btnYellow) {
				btnYellow.setBackground(Color.YELLOW);
				label.setText("노란색 버튼이 클릭됨");
			}else if (e.getSource() == btnPink) {
				btnYellow.setBackground(Color.YELLOW);
				btnPink.setBackground(Color.PINK);
				label.setText("핑크색 버튼이 클릭됨");
			}else if (e.getSource() == btnBlue) {
				btnYellow.setBackground(Color.YELLOW);
				btnPink.setBackground(Color.PINK);
				btnBlue.setBackground(Color.BLUE);
				label.setText("파란색 버튼이 클릭됨");
			}
		}
	}
	public static void main(String[] args) {
		MyFrame t = new MyFrame();
	}
}
