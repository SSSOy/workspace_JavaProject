import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] choice = new int[2];
		int[] ran = new int[2];
		int[] one = new int[2];
		
		String[] c = {"����", "����", "��"};
		
		System.out.println("<< ���������� �ϳ����� ���� >>\n");
		
		while(true) {
			System.out.println("����(1) ����(2) ��(3) (2�� �Է�) : ");
			for(int i = 0; i < 2; i++) {
				choice[i] = sc.nextInt();
				if(choice[i] == 0) {
					System.out.println("�����մϴ�");
					System.exit(0);
				}
				ran[i] = r.nextInt(3) + 1;
			}
			
			System.out.println("you : " + c[choice[0] - 1] + ", " + c[choice[1] - 1]);
			System.out.println("com : " + c[ran[0] - 1] + ", " + c[ran[1] - 1]);
			System.out.println("�ϳ�����(1, 2) : ");
			one[0] = (sc.nextInt()) - 1;
			one[1] = r.nextInt(2);
			
			if(choice[one[0]] - ran[one[1]] == 0)
				System.out.println("�����ϴ� (��ǻ�� : " + c[ran[one[1]] - 1] + ")");
			else if(choice[one[0]] % 3 == (ran[one[1]] + 1) % 3)
				System.out.println("�̰���ϴ� (��ǻ�� : " + c[ran[one[1]] - 1] + ")");
			else
				System.out.println("�����ϴ� (��ǻ�� : " + c[ran[one[1]] - 1] + ")");
		}
	}

}
