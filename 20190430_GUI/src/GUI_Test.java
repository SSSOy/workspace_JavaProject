import java.awt.Dimension;
import javax.swing.*;

public class GUI_Test {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창이름");
		frame.setPreferredSize(new Dimension(300, 300));
		frame.setLocation(500, 300);
		
		JPanel p = new JPanel();
		JLabel l = new JLabel("태어난 달 : ");
		p.add(l);
		String[] picnics = {"봄꽃구경", "여름수영"};
		JComboBox<String> cd = new JComboBox<>(picnics);
		cd.addItem("가을캠프");
		cd.addItem("겨울스키");
		p.add(cd);
		
		Integer[] picnics2 = new Integer[12];
		for(int i = 1; i <= 12; i++)
			picnics2[i - 1] = i;
		JComboBox<Integer> cd2 = new JComboBox<>(picnics2);
		p.add(cd2);
		
		frame.add(p);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}