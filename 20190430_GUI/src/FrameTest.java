import java.awt.Dimension;
import javax.swing.*;

public class FrameTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("â");
		JLabel label = new JLabel("���̺�");
		
		frame.add(label);
		frame.setPreferredSize(new Dimension(400, 400)); //âũ��
		frame.setLocationRelativeTo(null);
		
		frame.pack(); //�� ���� â �ּ��Ѹ�, ���� �κи�
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JFrame frame2 = new JFrame("â2");
		frame2.pack();
		frame2.setVisible(true);
	}
}
