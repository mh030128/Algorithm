import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        for(int i = 0; i < input.length; i++) {
            input[i] = scanner.nextInt();
        }

        for(int i = 0; i < input.length; i++) {
            System.out.print((correct[i] - input[i]) + " ");
        }
    }
}
