import java.util.*;

public class RandomNumber {
	public static void main(String[] args) {
		Random r = new Random();
		int start = 0;
		int end = 3;
		int randomNumber = r.nextInt((end - start + 1)) + start;
		System.out.println(randomNumber);
	}
}

