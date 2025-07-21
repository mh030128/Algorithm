package _2439;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num; i++) {
            for(int j = 0; j < num - i -1; j++) {
                sb.append(" ");
            }
            for(int k = 0; k <= i; k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        String star = sb.toString();
        System.out.println(star);
        br.close();
    }
}
