import java.util.*;

public class ThreeSixNine {
	public static void main(String[] args) {
		System.out.println("<< 369°ÔÀÓ >>>");
		for(int i = 1; i <= 100; i++) {
			if(i % 5 == 0) 
				System.out.println("»Ñ¼õ!");
			
			if(i > 10)
				if((i / 10) % 3 == 0) 
					System.out.print("Â¦");
				
			
			else if((i % 10) % 3 == 0)  
				System.out.print("Â¦   ");
			else
				System.out.print(i + "   ");
			
		}
	}
}
