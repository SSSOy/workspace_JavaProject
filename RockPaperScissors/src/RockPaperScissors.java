import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("<< ���������� ���� >>\n");
		
		while(true) {
			System.out.println("����(1) ����(2) ��(3) (����� 0 �Է�) : ");
			int choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			
			int ran = r.nextInt(3) + 1;
			
			if(choice - ran == 0)
				System.out.println("�����ϴ� (��ǻ�� : " + ran + ")");
			else if(choice % 3 == (ran + 1) % 3)
				System.out.println("�̰���ϴ� (��ǻ�� : " + ran + ")");
			else
				System.out.println("�����ϴ� (��ǻ�� : " + ran + ")");
		}
	}
}
