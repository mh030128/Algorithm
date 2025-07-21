package _9086;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        String[] ex = new String[T];

        for(int i = 0; i < T; i++) {
            String S = scanner.next();
            ex[i] = S.substring(0, 1) + S.substring(S.length() -1, S.length());
        }

        for(int i = 0; i < T; i++) {
            System.out.println(ex[i]);
        }

    }
}
