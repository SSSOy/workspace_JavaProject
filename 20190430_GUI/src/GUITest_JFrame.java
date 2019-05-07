import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class GUITest_JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창 이름");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 200));
		//frame.setSize(300, 400);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("집에 가고싶다");
		label.setOpaque(true);
		label.setBackground(Color.pink);
		label.setText("진짜 집에 보내죠라");
		
		JTextField tf= new JTextField("집에 언제가지?");
		panel.add(label);
		panel.add(tf);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
