import javax.swing.*;
import java.awt.event.*;
import java.util.Random;
import java.awt.*;

public class GUITest12_Listeners {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Up & Down");
		JPanel panel = new JPanel();
		frame.setLocation(500, 500);
		frame.setPreferredSize(new Dimension(300, 200));
		
		JTextField tfInput = new JTextField(10);
		JTextField tfInput2 = new JTextField(20);
		JLabel lbOutput = new JLabel("엔터!");
		
		
		tfInput.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lbOutput.setText(tfInput.getText() + " ExplOration");
			}
		});
		tfInput.addFocusListener(new FocusListener(){
			public void focusLost(FocusEvent e) {
				lbOutput.setText("다시 돌아와ㅠㅅㅠ");
			}
			public void focusGained(FocusEvent e) {
				lbOutput.setText("나만 바라봐 'ㅅ'");
			}
		});
		
		panel.add(tfInput);
		panel.add(tfInput2);
		panel.add(lbOutput);
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}

}
