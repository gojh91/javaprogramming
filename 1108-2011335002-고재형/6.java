//2011335002
package java1108;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements MouseListener,MouseMotionListener{
	public MyFrame() {
		setTitle("Mouse Event");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		panel.addMouseListener(this);
		panel.addMouseMotionListener(this);

		add(panel);
		setVisible(true);
	}

	void display(String s, MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println(s + "X=" + e.getX() + "Y=" + e.getY());
	}

		public void mousePressed(MouseEvent e) {
			display("Mouse pressed (# of clicks"+ e.getClickCount()+")",e);
		}

		public void mouseReleased(MouseEvent e) {
			display("Mouse Released (# of clicks"+ e.getClickCount()+")",e);
			
		}public void mouseClicked(MouseEvent e) {
			display("Mouse Clicked (# of clicks"+ e.getClickCount()+")",e);
			
		}
		public void mouseDragged(MouseEvent e) {
			display("Mouse dragged",e);
		}
		public void mouseMoved(MouseEvent e) {
			display("Mouse moved",e);
		}
		public void mouseEntered(MouseEvent e) { display("Mouse entered", e);}
		public void mouseExited(MouseEvent e) {display("Mouse exited", e);
	}
}
