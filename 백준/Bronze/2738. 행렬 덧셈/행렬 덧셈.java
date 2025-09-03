import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] arrA = new int[n][m];
        int[][] arrB = new int[n][m];
        int[][] result = new int[arrA.length][arrA[0].length];

        for(int i = 0; i < arrA.length; i++) {
            for(int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < arrB.length; i++) {
            for(int j = 0; j < arrB[i].length; j++) {
                arrB[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[i].length; j++) {
                result[i][j] = arrA[i][j] + arrB[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
