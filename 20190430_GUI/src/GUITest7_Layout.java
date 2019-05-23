import java.awt.*;
import javax.swing.*;


public class GUITest7_Layout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		frame.setPreferredSize(new Dimension(400, 600));
		
		//FlowLayout fl = new FlowLayout();
		//fl.setAlignment(FlowLayout.RIGHT);
		//panel.setLayout(fl);
		
		BorderLayout bl = new BorderLayout();
		panel.setLayout(bl);
		
		JButton btNorth = new JButton("NORTH");
		JButton btSouth = new JButton("SOUTH");
		JButton btWest = new JButton("WEST");
		JButton btEast = new JButton("EAST");
		JButton btCenter = new JButton("Center");
		panel.add(btNorth, BorderLayout.NORTH);
		panel.add(btSouth, BorderLayout.SOUTH);
		panel.add(btWest, BorderLayout.WEST);
		panel.add(btEast, BorderLayout.EAST);
		panel.add(btCenter, BorderLayout.CENTER);
		
		JPanel panelNorth = new JPanel();
		
		for(int i = 0; i < 10; i++) {
			JButton bts = new JButton("Button" + i);
			panelNorth.add(bts);
		}
		
		panel.add(panelNorth, BorderLayout.NORTH);
		frame.add(panel);
		
		GridLayout gl = new GridLayout(2, 3);
		JPanel panelCenter = new JPanel();
		panelCenter.setLayout(gl);
		
		for(int i = 0; i < 6; i++) {
			JButton bts = new JButton("Button" + i);
			panelCenter.add(bts);
		}
		
		panel.add(panelCenter, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
