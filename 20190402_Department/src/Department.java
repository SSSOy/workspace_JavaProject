import java.util.*;

public class Department {
	public static void main(String[] args) {
		String[][] d = {{"뉴미디어소프트웨어", "뉴미디어웹솔루션", "뉴미디어디자인"},
						{"인터랙티브미디어", "뉴미디어디자인", "뉴미디어웹솔루션"}};

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("학번 입력 (0입력시 종료) : ");
	
		String StudentID = sc.nextLine();
		if(StudentID.equals("0")) {
			System.out.println("종료합니다^^");
			break;
		}//if
		
		int g = StudentID.charAt(0) - '0';
		int b = StudentID.charAt(1) - '0' - 1;

		System.out.println(d[g / 3][b /2] + "과 입니다!"); 
		
		}// while
	}//main
}//class
