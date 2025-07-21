package _2675;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        for(int i = 0; i < T; i++) {
            int R = scanner.nextInt();
            String S = scanner.next();

            StringBuilder sb = new StringBuilder();

            for(int j = 0; j < S.length(); j++) {
                char c = S.charAt(j);

                for(int k = 0; k < R; k++) {
                    sb.append(c);
                }
            }
            System.out.println(sb);
        }
        scanner.close();
    }
}
