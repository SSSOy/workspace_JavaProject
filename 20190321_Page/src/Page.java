import java.util.*;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("�Խù� ���� �Է�(exit�Է� �� ����) : ");
		
		String post = sc.nextLine();
		if(post.equals("exit")) {
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
		int p = Integer.parseInt(post);
		int page = p / 7;
		if(p % 7 != 0)
			page++;
		
		System.out.println("������ ��ũ�� ���� : " + page);
		}	
	}
}
