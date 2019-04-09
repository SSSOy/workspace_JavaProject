import java.util.*;

public class Nsum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		
		System.out.print("숫자 입력 : ");
		String n = sc.nextLine();
		
		nSum(sum, n);
	}

	private static void nSum(int sum, String n) {
		for(int i = 0; i < n.length(); i++) 
			sum += n.charAt(i) - '0';
		
		System.out.println(sum);
	}
}
