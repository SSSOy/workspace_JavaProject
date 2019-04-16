import java.util.*;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("<< 가위바위보 게임 >>\n");
		
		while(true) {
			System.out.println("가위(1) 바위(2) 보(3) (종료는 0 입력) : ");
			int choice = sc.nextInt();
			
			if(choice == 0) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			
			int ran = r.nextInt(3) + 1;
			
			if(choice - ran == 0)
				System.out.println("비겼습니다 (컴퓨터 : " + ran + ")");
			else if(choice % 3 == (ran + 1) % 3)
				System.out.println("이겼습니다 (컴퓨터 : " + ran + ")");
			else
				System.out.println("졌습니다 (컴퓨터 : " + ran + ")");
		}
	}
}
