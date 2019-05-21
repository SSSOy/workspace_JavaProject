import javax.swing.*;
import java.awt.*;

public class GUITest4_JRadioButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JRadioButton exo = new JRadioButton("EXO");
		JRadioButton bts = new JRadioButton("BTS");
		ButtonGroup bg = new ButtonGroup();
		
		bg.add(exo);
		bg.add(bts);
		panel.add(exo);
		panel.add(bts);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
