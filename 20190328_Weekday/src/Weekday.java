import java.util.*;

public class Weekday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< 오늘은 무슨 요일일까요? >>\n");
		
		while(true) {
			System.out.println("1 ~ 7 입력(종료는 0 입력) : ");
			int week = sc.nextInt();
			
			switch(week) {
			case 0 :
				System.out.println("종료합니다^^");
				System.exit(0);
			case 1 : 
				System.out.println("월요일!");	break;
			case 2 : 
				System.out.println("화요일!");	break;
			case 3 : 
				System.out.println("수요일!");	break;
			case 4 : 
				System.out.println("목요일!");	break;
			case 5 : 
				System.out.println("금요일!");	break;
			case 6 : 
				System.out.println("토요일!");	break;
			case 7 : 
				System.out.println("일요일!");	break;
			default : 
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
