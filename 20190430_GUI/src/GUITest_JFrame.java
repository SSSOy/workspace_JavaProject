import java.awt.Color;
import java.awt.Dimension;
import javax.swing.*;

public class GUITest_JFrame {
	public static void main(String[] args) {
		JFrame frame = new JFrame("â �̸�");
		frame.setLocation(500, 300);
		frame.setPreferredSize(new Dimension(300, 200));
		//frame.setSize(300, 400);
		
		JPanel panel = new JPanel();
		JLabel label = new JLabel("���� ����ʹ�");
		label.setOpaque(true);
		label.setBackground(Color.pink);
		label.setText("��¥ ���� �����Ҷ�");
		
		JTextField tf= new JTextField("���� ��������?");
		panel.add(label);
		panel.add(tf);
		
		frame.add(panel);
		
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
