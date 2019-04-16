import java.util.*;

public class RockPaperScissors2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int ran = r.nextInt(3) + 1;
		int choice;
		boolean result = false;
		
		System.out.println("<< 묵찌빠 게임 >>\n");
		
		while(true) {
			System.out.println("가위(1) 바위(2) 보(3) : ");
			choice = sc.nextInt();
			
			if(!(choice - ran == 0)) {
				if(choice % 3 == (ran + 1) % 3)
					result = true;
				break;
			}
			else 
				System.out.println("비겼습니다 다시!");
			
			
		}
		
		while(true) {
			if(result) 
				System.out.print("당신의 공격, ");
			else 
				System.out.print("컴퓨터의 공격, ");
			System.out.println("가위(1) 바위(2) 보(3) : ");
			choice = sc.nextInt();
			ran = r.nextInt(3) + 1;
			
			if(choice - ran == 0) {
				if(result) 
					System.out.println("이겼습니다 (컴퓨터 : " + ran + ")");
				else 
					System.out.println("졌습니다 (컴퓨터 : " + ran + ")");
				System.exit(0);
			}
			else {
				if((choice == 1 && ran == 3) ||
						(choice == 2 && ran == 1) ||
						(choice == 3 && ran == 2))
					result = true;
				else
					result = false;
				System.out.println("당신의 선택 : " + choice + ", 컴퓨터의 선택 : " + ran);
			}
		}
	}
}
