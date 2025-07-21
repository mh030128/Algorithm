package _10813;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int basketNum = Integer.parseInt(str[0]);
        int changeNum = Integer.parseInt(str[1]);

        int[] basket = new int[basketNum + 1];

        for(int m = 1; m <= basketNum; m++) {
            basket[m] = m;
        }

        for(int m = 0; m < changeNum; m++) {
            String[] readArray = br.readLine().split(" ");

            int ball1 = Integer.parseInt(readArray[0]);
            int ball2 = Integer.parseInt(readArray[1]);

            int temp = basket[ball1];
            basket[ball1] = basket[ball2];
            basket[ball2] = temp;

        }
        StringBuilder sb = new StringBuilder();
        for(int m = 1; m <= basketNum; m++) {
            sb.append(basket[m]).append(" ");
        }
        System.out.println(sb);
    }
}
