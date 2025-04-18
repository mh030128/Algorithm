import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int basket[] = new int[N + 1];

        // 바구니 번호에 맞게 초기화
        for(int m = 1; m <= N; m++) {
            basket[m] = m;
        }

        for(int m = 0; m < M; m++) {
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            int temp = basket[i];
            basket[i] = basket[j];
            basket[j] = temp;

        }

        for(int m = 1; m <= N; m++) {
            System.out.print(basket[m] + " ");
        }
    }
}
