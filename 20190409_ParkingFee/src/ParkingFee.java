import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		int minute = sc.nextInt();
		
		if(minute <= 30) {
			System.out.println("�ݾ��� 2000���Դϴ�.");
			System.exit(0);
		}
		
		minute -= 30;
		int m = minute / 10;
		if(minute % 10 > 0) 
			m++;
		int price = 2000 + m * 1000;
		
		System.out.println("�ݾ��� " + price + "���Դϴ�.");
	}
}
