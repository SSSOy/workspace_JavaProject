import java.awt.*;
import javax.swing.*;

public class GUITest6_RSPGame {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon("");
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon("");
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon("");
		JButton rockButton = new JButton(scissorsImage);
		ImageIcon paperImage = new ImageIcon("");
		JButton paperButton = new JButton(scissorsImage);
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
