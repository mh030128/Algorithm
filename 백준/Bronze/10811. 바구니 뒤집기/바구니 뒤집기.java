import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int basketNum = scanner.nextInt();
        int[] basket = new int[basketNum];
        int inverseNum = scanner.nextInt();

        for(int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for(int i = 0; i < inverseNum; i++) {
            int num1 = scanner.nextInt() - 1;
            int num2 = scanner.nextInt() - 1;

            while(num1 < num2) {
                int temp = basket[num1];
                basket[num1] = basket[num2];
                basket[num2] = temp;
                num1++;
                num2--;
            }
        }
        for(int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
