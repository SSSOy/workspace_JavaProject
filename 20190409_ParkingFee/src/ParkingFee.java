import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("�����ð� �Է�(��) : ");
			int minute = sc.nextInt();
			
			if(minute == 0) {
				System.out.println("�����մϴ�");
				System.exit(0);
			}
			else if(minute <= 30) {
				System.out.println("�ݾ��� 1500���Դϴ�.");
				continue;
			}
			else if(minute / 60 >= 24) {
				System.out.println("�����ð��� �ʰ��Ͽ����ϴ�");
				continue;
			}
			
			minute -= 30;
			int m = minute / 10;
			if(minute % 10 > 0) 
				m++;
			int price = 1500 + m * 1000;
			
			if(price > 25000) 
				System.out.println("�ݾ��� 25000���Դϴ�.");
			else 
				System.out.println("�ݾ��� " + price + "���Դϴ�.");
		}
	}
}
