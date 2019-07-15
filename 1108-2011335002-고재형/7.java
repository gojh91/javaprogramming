//2011335002
package java1108;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
	public MyFrame() {
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.addMouseListener(new MyMouseAdapter());

		add(panel);
		setVisible(true);
	}

	protected void display(String s, MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(s + "X=" + e.getX() + "Y=" + e.getY());
	}

	class MyMouseAdapter extends MouseAdapter {
		public void mouseEntered(MouseEvent e) {
			display("Mouse entered", e);
		}

		public void mouseExited(MouseEvent e) {
			display("Mouse exited", e);
		}
	}
}
