import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		// 주사위 눈이 모두 같은 경우
		if ((a==b) && (b==c)) {
			System.out.println(10000 + (a*1000));
		} 
		// 주사위 눈이 2개 같은 경우
		else if ((a==b) || (a==c)) {
			System.out.println(1000 + (a*100));
		} else if (b==c) {
			System.out.println(1000 + (b*100));
		} 
		// 주사위 눈이 모두 다른 경우
		else {
			int max = (a > b ? a : b);
			if (max < c) {
				max = c;
				System.out.println(c * 100);
			} else {
				System.out.println(max * 100);
			}
		}
	}
}
