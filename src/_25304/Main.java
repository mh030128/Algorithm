package _25304;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalPrice = scanner.nextInt();
        int totalQuantity = scanner.nextInt();

        int total = 0;

        for(int i = 0; i < totalQuantity; i++) {
            int price = scanner.nextInt();
            int quantity = scanner.nextInt();

            total += (price * quantity);
        }

        if(totalPrice - total == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
