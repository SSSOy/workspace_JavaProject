import java.util.*;

public class ThreeSixNine {
	public static void main(String[] args) {
		
		System.out.println("<< 369���� >>>");
		
		boolean t = false;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 5 == 0) {
				System.out.println("�Ѽ�!");
				continue;
			}
			else {
				String s = Integer.toString(i);
				for(int j = 0; j < s.length(); j++) {
					if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') {
						System.out.print("¦");
						t = true;
					}
				}
				System.out.print("  ");
			}
			
			if(t == false) 
				System.out.print(i + "  ");
		}//for
	}//main
}//class
