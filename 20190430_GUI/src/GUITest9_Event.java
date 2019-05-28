import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class GUITest9_Event {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Event");
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		JTextField tfInput = new JTextField(10);
		//JButton btRun = new JButton("⇒");
		JButton btRun = new JButton("*12");
		JLabel lbOutput = new JLabel();
		//버튼에 액션 리스너 추가
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = Integer.parseInt(tfInput.getText());
				lbOutput.setText(Integer.toString(input * 12));
			}
		};
		
		btRun.addActionListener(al);
		
		panel.add(tfInput);
		panel.add(btRun);
		panel.add(lbOutput);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
