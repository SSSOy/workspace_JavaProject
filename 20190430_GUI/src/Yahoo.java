import java.awt.Dimension;

import javax.swing.*;

public class Yahoo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(500, 300);
		
		JPanel p = new JPanel();
		JLabel label = new JLabel("야호");
		JTextField tf = new JTextField("야호");
		p.add(label);
		p.add(tf);
		
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
