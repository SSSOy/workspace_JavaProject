import java.util.*;

public class Department {
	public static void main(String[] args) {
		String[][] d = {{"���̵�����Ʈ����", "���̵�����ַ��", "���̵�������"},
						{"���ͷ�Ƽ��̵��", "���̵�������", "���̵�����ַ��"}};

		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
		System.out.print("�й� �Է� (0�Է½� ����) : ");
	
		String StudentID = sc.nextLine();
		if(StudentID.equals("0")) {
			System.out.println("�����մϴ�^^");
			break;
		}//if
		
		int g = StudentID.charAt(0) - '0';
		int b = StudentID.charAt(1) - '0' - 1;

		System.out.println(d[g / 3][b /2] + "�� �Դϴ�!"); 
		
		}// while
	}//main
}//class
