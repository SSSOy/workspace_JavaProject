import java.util.*;

public class Echo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("�Ҹ��� ������~ (���� : exit) : ");
			String echo = sc.nextLine();
			if(echo.equals("exit")) {
				System.out.println("�����մϴ�^^");
				System.exit(0);
			}
			System.out.println(echo + "~~");
		}
	}
}
