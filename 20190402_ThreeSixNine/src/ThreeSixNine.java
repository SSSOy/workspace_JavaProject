import java.util.*;

public class ThreeSixNine {
	public static void main(String[] args) {
		System.out.println("<< 369���� >>>");
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) 
				System.out.println("�Ѽ�!");
			
			if(i > 10)
				if((i / 10) % 3 == 0) 
					System.out.print("¦");
				
			
			else if((i % 10) % 3 == 0)  
				System.out.print("¦   ");
			else
				System.out.print(i + "   ");
			
		}
	}
}
