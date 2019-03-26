import java.util.*;

public class Page {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("게시물 개수 입력(exit입력 시 종료) : ");
		
		String post = sc.nextLine();
		if(post.equals("exit")) {
			System.out.println("종료합니다.");
			System.exit(0);
		}
		int p = Integer.parseInt(post);
		int page = p / 7;
		if(p % 7 != 0)
			page++;
		
		System.out.println("페이지 링크의 개수 : " + page);
		}	
	}
}
