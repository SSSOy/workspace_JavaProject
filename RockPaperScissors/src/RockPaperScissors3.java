import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] choice = new int[2];
		int[] ran = new int[2];
		int[] one = new int[2];
		
		String[] c = {"가위", "바위", "보"};
		
		System.out.println("<< 가위바위보 하나빼기 게임 >>\n");
		
		while(true) {
			System.out.println("가위(1) 바위(2) 보(3) (2번 입력) : ");
			for(int i = 0; i < 2; i++) {
				choice[i] = sc.nextInt();
				if(choice[i] == 0) {
					System.out.println("종료합니다");
					System.exit(0);
				}
				ran[i] = r.nextInt(3) + 1;
			}
			
			System.out.println("you : " + c[choice[0] - 1] + ", " + c[choice[1] - 1]);
			System.out.println("com : " + c[ran[0] - 1] + ", " + c[ran[1] - 1]);
			System.out.println("하나빼기(1, 2) : ");
			one[0] = (sc.nextInt()) - 1;
			one[1] = r.nextInt(2);
			
			if(choice[one[0]] - ran[one[1]] == 0)
				System.out.println("비겼습니다 (컴퓨터 : " + c[ran[one[1]] - 1] + ")");
			else if(choice[one[0]] % 3 == (ran[one[1]] + 1) % 3)
				System.out.println("이겼습니다 (컴퓨터 : " + c[ran[one[1]] - 1] + ")");
			else
				System.out.println("졌습니다 (컴퓨터 : " + c[ran[one[1]] - 1] + ")");
		}
	}

}
