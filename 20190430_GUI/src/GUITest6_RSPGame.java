import java.awt.*;
import javax.swing.*;

public class GUITest6_RSPGame {
	static String[] fileName = {"src/images/scissors.png", "src/images/rock.png", "src/images/paper.png"};

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(fileName[1]);
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon(fileName[0]);
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon(fileName[1]);
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon(fileName[2]);
		JButton paperButton = new JButton(paperImage);
		
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
