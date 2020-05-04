import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame=new JFrame("BINGO");
		frame.setSize(500,500);
		frame.setLocation(500,510);
		JPanel panel=new JPanel();
		panel.setLayout(new GridLayout(3,3));
		JButton []button=new JButton[9];
		for(int i=0;i<9;i++) {
			button[i]=new JButton();
			button[i].setText(""+i);
			panel.add(button[i]);
		}
		frame.addMouseListener(new MyMouseListener());
		frame.addMouseMotionListener(new MyMouseListener());
		frame.setContentPane(panel);
		frame.setVisible(true);
		button[0].addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JButton btn=(JButton)e.getSource();
				btn.setText("¿ÏÀü ¾î·Æ³×");
			}
			
		});
	}
}

class MyMouseListener implements MouseListener,MouseMotionListener{
	public void mousePressed(MouseEvent e) {
		System.out.println("pressed\n");
	}
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mouseDragged(MouseEvent e) {
	}
	public void mouseMoved(MouseEvent e) {
	}
}
