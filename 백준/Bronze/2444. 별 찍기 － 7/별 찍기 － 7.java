import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        // 위쪽 삼각형
        for(int i = 1; i <= n; i++) {
            // 공백출력
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별출력
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형
        for(int i = n - 1; i >= 1; i--) {
            // 공백출력
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 별출력
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
