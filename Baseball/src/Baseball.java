import java.util.*;

public class Baseball {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		int[] com = new int[3];
		int[] you = new int[3];
		
		System.out.println("<<< 야구게임 >>>");
		
		for(int i = 0; i < 3; i++) {
			com[i] = (char)r.nextInt(10);
			for(int j = 0; j < i; j++)
				if(com[i] == com[j])
					i--;
			System.out.print(com[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			int[] count = new int[2];
			
			System.out.println("0~9사이의 수 3개 입력(기회 " + (10 - i) + "번) : ");
			for(int j = 0; j < 3; j++) {
				you[j] = sc.nextInt(); 
				for(int k = 0; k < 3; k++) {
					if(you[j] == com[k]) {
						if(j == k) 
							count[0]++;
						else
							count[1]++;
					}
				}
			}
			if(count[0] == 3) {
				System.out.println("정답입니다!!!!");
				System.exit(0);
			}
			System.out.println(count[0] + "스트라이크, " + count[1] + "볼");
		}
	}

}
