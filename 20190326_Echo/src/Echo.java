import java.util.*;

public class Echo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("소리를 질러요~ (종료 : exit) : ");
			String echo = sc.nextLine();
			if(echo.equals("exit")) {
				System.out.println("종료합니다^^");
				System.exit(0);
			}
			System.out.println(echo + "~~");
		}
	}
}
