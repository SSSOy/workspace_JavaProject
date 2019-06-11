import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class GUITest6_RSPGame {
	static String[] fileName = {"src/images/scissors.png", "src/images/rock.png", "src/images/paper.png"};
	static String[] answerString = {"사용자 짐", "비김", "사용자가 이김"};
	protected static int computer;
	protected static int player;
	protected static int answer;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		panel.setLayout(new GridLayout(2, 1));
		JPanel p = new JPanel();
		
		JLabel result = new JLabel("Win");
		ImageIcon computerImage = new ImageIcon(fileName[1]);
		JLabel computerLabel = new JLabel(computerImage);
		
		ImageIcon scissorsImage = new ImageIcon(fileName[0]);
		JButton scissorsButton = new JButton(scissorsImage);
		ImageIcon rockImage = new ImageIcon(fileName[1]);
		JButton rockButton = new JButton(rockImage);
		ImageIcon paperImage = new ImageIcon(fileName[2]);
		JButton paperButton = new JButton(paperImage);
		
		ActionListener al = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Object obj = e.getSource();
				if(obj == scissorsButton) 
					player = 1;
				else if(obj == rockButton) 
					player = 2;
				else
					player = 3;
				
				computer = makeComputer();
				ImageIcon computerImage = new ImageIcon(fileName[computer - 1]);
				computerLabel.setIcon(computerImage);
				answer = compare(player, computer);
				result.setText(answerString[answer]);
			}
		};
		
		scissorsButton.addActionListener(al);
		rockButton.addActionListener(al);
		paperButton.addActionListener(al);
		
		panel.add(result);
		panel.add(computerLabel);
		panel.add(p);
		panel.add(scissorsButton);
		panel.add(rockButton);
		panel.add(paperButton);
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	private static int compare(int p, int c) {
		if ((p + 1) % 3 == c % 3) 
			return 0;
		else if (p == c) 
			return 1;
		else 
			return 2;
	}

	private static int makeComputer() {
		Random random = new Random();
		int c = random.nextInt(3) + 1; // 1~3 임의의 수
		return c;
	}
}
