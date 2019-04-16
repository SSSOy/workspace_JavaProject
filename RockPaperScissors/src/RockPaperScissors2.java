import java.util.*;

public class RockPaperScissors2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(3) + 1;
		int choice;
		boolean result = false;
		
		System.out.println("<< ����� ���� >>\n");
		
		while(true) {
			System.out.println("����(1) ����(2) ��(3) : ");
			choice = sc.nextInt();
			
			if(!(choice - ran == 0)) {
				if(choice % 3 == (ran + 1) % 3)
					result = true;
				break;
			}
			else 
				System.out.println("�����ϴ� �ٽ�!");
			
			
		}
		
		while(true) {
			if(result) 
				System.out.print("����� ����, ");
			else 
				System.out.print("��ǻ���� ����, ");
			System.out.println("����(1) ����(2) ��(3) : ");
			choice = sc.nextInt();
			ran = r.nextInt(3) + 1;
			
			if(choice - ran == 0) {
				if(result) 
					System.out.println("�̰���ϴ� (��ǻ�� : " + ran + ")");
				else 
					System.out.println("�����ϴ� (��ǻ�� : " + ran + ")");
				System.exit(0);
			}
			else {
				if((choice == 1 && ran == 3) ||
						(choice == 2 && ran == 1) ||
						(choice == 3 && ran == 2))
					result = true;
				else
					result = false;
				System.out.println("����� ���� : " + choice + ", ��ǻ���� ���� : " + ran);
			}
		}
	}
}
