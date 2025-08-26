import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 1. 위쪽 삼각형
        for (int i = 1; i <= n; i++) {
            // 공백출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2. 아래쪽 삼각형
        for (int i = n - 1; i >= 1; i--) {
            // 공백출력
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별출력
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        br.close();
    }
}
