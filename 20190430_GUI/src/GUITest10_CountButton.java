import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest10_CountButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Count Button");
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		frame.setPreferredSize(new Dimension(300, 100));
		
		JLabel lbNumber = new JLabel("0");
		JButton btCount = new JButton("Click Counter");
		
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i = Integer.parseInt(lbNumber.getText());
				lbNumber.setText(Integer.toString(i + 1));
			}
		};
		
		btCount.addActionListener(al);
		lbNumber.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lbNumber);
		panel.add(btCount);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
