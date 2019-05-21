import javax.swing.*;
import java.awt.*;

public class GUITest5_ImageIcon {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		ImageIcon BH = new ImageIcon("src/images/BH.jpg");
		JLabel imageLabel = new JLabel(BH);
		
		ImageIcon BBH = new ImageIcon("src/images/BBB.jpg");
		ImageIcon smallBH = new ImageIcon(BBH.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT));
		JButton b = new JButton(smallBH);
		
		
		panel.add(imageLabel);
		panel.add(b);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
