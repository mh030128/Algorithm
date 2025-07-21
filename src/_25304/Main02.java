package _25304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int totalPrice = Integer.parseInt(br.readLine());
        int totalQuantity = Integer.parseInt(br.readLine());

        int total = 0;

        for(int i = 0; i < totalQuantity; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            total += ((Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken())));

        }

        if (totalPrice == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
