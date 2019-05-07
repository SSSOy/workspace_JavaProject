import java.awt.Dimension;
import javax.swing.*;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("창");
		JLabel label = new JLabel("레이블");
		
		frame.add(label);
		frame.setPreferredSize(new Dimension(400, 400)); //창크기
		frame.setLocationRelativeTo(null);
		
		frame.pack(); //안 쓰면 창 최소한만, 위에 부분만
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame2 = new JFrame("창2");
		frame2.pack();
		frame2.setVisible(true);
	}
}
