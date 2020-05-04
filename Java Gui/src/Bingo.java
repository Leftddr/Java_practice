import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.*;
import java.util.Vector;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Bingo {

	static Vector<String> id = new Vector<String>();
	static Vector<String> age = new Vector<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension dim = new Dimension(400, 180);
		
		JFrame frame = new JFrame("Morph's House");
		frame.setLocation(200, 400);
		frame.setPreferredSize(dim);
		
		final JTextField userage = new JTextField(12);
		JPanel panel1 = new JPanel();
		panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
		panel1.add(new JLabel("Player age : "));
		panel1.add(userage);
		
		final JTextField userid = new JTextField(12);
		JPanel panel2 = new JPanel();
		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.add(new JLabel("Player name : "));
		panel2.add(userid);
		panel2.add(panel1);
		
		JButton btn1 = new JButton("START");
		frame.add(panel2);
		frame.add(btn1, BorderLayout.SOUTH);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.add(userid.getText());
				age.add(userage.getText());
				userid.setText("");
				userage.setText("");
				Rain rain = new Rain();
				rain.start();
			}
		});
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Person extends Thread implements KeyListener{
	JLabel label2;
	JLabel label3;
	JLabel label4;
	int key;
	int x_pos;
	int y_pos = 598;
	int cri = 0;
	KeyEvent e;
	public Person(JLabel label2, JLabel label3, JLabel label4, int x_pos) {
		this.label2 = label2;
		this.label3 = label3;
		this.label4 = label4;
		this.x_pos = x_pos;
	}
	@Override
	public void run() {
		while(true) {
			this.keyPressed(e);
		if(key == 37) {
			if(x_pos - 1 >= 0) {
				this.label2.setLocation(x_pos - 1, 600);
				this.label3.setLocation(x_pos - 1, 599);
				this.label4.setLocation(x_pos - 1, 598);
				this.x_pos -= 1;
			}
		}
		else if(key == 39) {
			if(x_pos + 1 <= 600) {
				this.label2.setLocation(x_pos + 1, 600);
				this.label3.setLocation(x_pos + 1, 599);
				this.label4.setLocation(x_pos + 1, 598);
				this.x_pos += 1;
			}
		}
		if(this.cri == 1) {break;}
		}
	}
	public void receive(int x_pos, int y_pos) {
		if(this.y_pos <= y_pos) this.cri = 1;
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		this.key = e.getKeyCode();
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}

class Rain extends Thread{
	@Override
	public void run() {
		JFrame frame = new JFrame("Move Label");
		Container c = frame.getContentPane();
		c.setLayout(null);
		
		frame.setLocation(500, 500);
		frame.setPreferredSize(new Dimension(600, 600));
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label2 = new JLabel("X");
		JLabel label3 = new JLabel("X");
		JLabel label4 = new JLabel("X");
		label2.setLocation(100, 600);
		label3.setLocation(100, 599);
		label4.setLocation(100, 598);
		label2.setSize(30, 10);
		label3.setSize(30, 10);
		label4.setSize(30, 10);
		c.add(label2);
		c.add(label3);
		c.add(label4);
		
		Person person = new Person(label2, label3, label4, 300);
		person.start();
		
		int size = (int)(Math.random() * 20) + 1;
		
		ExecutorService executorService = Executors.newFixedThreadPool(size);
		executorService.submit(person);
		
		while(true) {
			JLabel label = new JLabel("OO");
			label.setSize(30, 10);
			int x_pos = (int)(Math.random() * 400);
			label.setLocation(x_pos, 0);
			c.add(label);
			Pointer pointer = new Pointer(label, x_pos);
			executorService.submit(pointer);
			//person.start();
		}
	}
}

class Pointer extends Thread{
	JLabel label;
	int x_pos;
	Person person;
	public Pointer(JLabel label, int x_pos) {
		this.label = label;
		this.x_pos = x_pos;
	}
	@Override
	public void run() {
		int time = (int)(Math.random() * 50) + 1;
		for(int y = 0; y < 600 ; y++) {
			this.label.setLocation(this.x_pos, y);
			try {
				Thread.sleep(time);
			}catch(InterruptedException ignore) {
				System.out.println("Happen Error");
			}
		}
	}
}
