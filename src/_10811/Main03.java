package _10811;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int basketNum = Integer.parseInt(st.nextToken());
        int inverseNum = Integer.parseInt(st.nextToken());
        int[] baskets = new int[basketNum + 1];

        for(int i = 1; i < baskets.length; i++) {
            baskets[i] = i;
        }

        for(int i = 0; i < inverseNum; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            while(num1 < num2) {
                int temp = baskets[num1];
                baskets[num1] = baskets[num2];
                baskets[num2] = temp;

                num1++;
                num2--;
            }
        }
        for(int i = 1; i < baskets.length; i++) {
            sb.append(baskets[i]).append(" ");
        }
        System.out.println(sb);
    }
}
