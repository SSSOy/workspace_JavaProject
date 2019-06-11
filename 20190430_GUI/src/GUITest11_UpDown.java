import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.util.Scanner;

public class GUITest11_UpDown {
	static int com;
	public static void main(String[] args) {
		JFrame frame = new JFrame("Up & Down");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		Random r = new Random();
		com = r.nextInt(100) + 1;
		
		JTextField tfInput = new JTextField(10);
		JButton btQuestion = new JButton("ÀÔ´Ï±î?");
		JLabel lbResult = new JLabel("1 ~ 100 »çÀÌ ¼ýÀÚ ¸ÂÃçºÁ");
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int user = Integer.parseInt(tfInput.getText());
				tfInput.setText("");
				if(user == com) {
					lbResult.setText(user + " Win!!!");
				}
				else if(user > com) 
					lbResult.setText(user + " Down!");
				else {
					lbResult.setText(user + " Up!");
					com = r.nextInt(100) + 1;
				}
			}
		};
		
		btQuestion.addActionListener(al);
		tfInput.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btQuestion);
		panel.add(lbResult);		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
