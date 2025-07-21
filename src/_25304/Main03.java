package _25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int totalQuantity = Integer.parseInt(br.readLine());

        int total = 0;

        for(int i = 0; i < totalQuantity; i++) {
            String[] str = br.readLine().split(" ");

            int price = Integer.parseInt(str[0]);
            int quantity = Integer.parseInt(str[1]);

            total += (price * quantity);
        }

        if(total == totalPrice) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
