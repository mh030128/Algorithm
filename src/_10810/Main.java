package _10810;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();  // 바구니 수
        int M = scanner.nextInt();  // 공 넣기 횟수

        int basket[] = new int[N];

        for(int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();
            int k = scanner.nextInt();

            for(int b = i - 1; b <= j - 1; b++) {
                basket[b] = k;
            }
        }
        for (int result : basket) {
            System.out.print(result + " ");
        }
        scanner.close();
    }
}
