import java.util.*;

public class UpDown {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int num = r.nextInt(100) + 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.println("���� �Է�(��ȸ " + (10-i) + "��) : ");
			int n = sc.nextInt();
			if(n == num) {
				System.out.println("Win!!!");
				break;
			}
			else if(n > num) 
				System.out.println("Down!");
			else
				System.out.println("Up!");
		}
	}
}
