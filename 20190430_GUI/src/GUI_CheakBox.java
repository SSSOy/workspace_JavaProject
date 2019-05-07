import java.awt.Dimension;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI_CheakBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(500, 300);
		
		JPanel p = new JPanel();
		JCheckBox cbChicken = new JCheckBox("치킨");
		JCheckBox cbPizza = new JCheckBox("피자");
		
		p.add(cbChicken);
		p.add(cbPizza);
		
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
