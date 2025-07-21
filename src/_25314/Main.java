package _25314;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < num/4; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
