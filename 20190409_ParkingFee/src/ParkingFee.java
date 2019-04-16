import java.util.*;

public class ParkingFee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주차시간 입력(분) : ");
			int minute = sc.nextInt();
			
			if(minute == 0) {
				System.out.println("종료합니다");
				System.exit(0);
			}
			else if(minute <= 30) {
				System.out.println("금액은 1500원입니다.");
				continue;
			}
			else if(minute / 60 >= 24) {
				System.out.println("주차시간을 초과하였습니다");
				continue;
			}
			
			minute -= 30;
			int m = minute / 10;
			if(minute % 10 > 0) 
				m++;
			int price = 1500 + m * 1000;
			
			if(price > 25000) 
				System.out.println("금액은 25000원입니다.");
			else 
				System.out.println("금액은 " + price + "원입니다.");
		}
	}
}
