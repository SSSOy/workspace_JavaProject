import java.util.*;

public class Weekday {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<< ������ ���� �����ϱ��? >>\n");
		
		while(true) {
			System.out.println("1 ~ 7 �Է�(����� 0 �Է�) : ");
			int week = sc.nextInt();
			
			switch(week) {
			case 0 :
				System.out.println("�����մϴ�^^");
				System.exit(0);
			case 1 : 
				System.out.println("������!");	break;
			case 2 : 
				System.out.println("ȭ����!");	break;
			case 3 : 
				System.out.println("������!");	break;
			case 4 : 
				System.out.println("�����!");	break;
			case 5 : 
				System.out.println("�ݿ���!");	break;
			case 6 : 
				System.out.println("�����!");	break;
			case 7 : 
				System.out.println("�Ͽ���!");	break;
			default : 
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}
	}
}
