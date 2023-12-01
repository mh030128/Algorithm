import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	// 정수의 개수 n개
	
		int[] intArray = new int[n];
		for(int i=0; i<n; i++) {
			intArray[i] = sc.nextInt();
		}
		int v = sc.nextInt();	// 찾으려는 정수 v
		int cnt = 0;	// 찾으려는 정수와 배열안의 정수 갯수
		for(int i=0; i<n; i++) {
			if (v == intArray[i]) {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}