import java.util.*;

public class UpDownBot {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< UP & DOWN BOT >>\n");
		
		int up = 1, down = 100;
		
		for(int i = 0; i < 10; i++) {
			int num = r.nextInt((down - up + 1)) + up;
			//int num = down - ((down - up)/2) - 1;
			System.out.println("당신이 생각한 숫자는 " + num + "입니다!(기회 " + (10-i) +"번)");
			
			System.out.println("Up : 1 / Down : 2 / Success : 3 ");
			System.out.print("정답입니까? : ");
			int n = sc.nextInt();
			
			switch(n) {
			case 1 :
				up = num; break;
			case 2 :
				down = num; break;
			case 3 :
				System.out.println("컴퓨터가 정답을 맞췄습니다!");
				System.exit(0);
				
			}
		}
		System.out.println("컴퓨터가 맞추지 못했습니다ㅠㅠ");
	}

}