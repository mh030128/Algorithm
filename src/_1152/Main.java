package _1152;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine().trim();   // 양쪽 공백 제거

        if(s.isEmpty()) {
            System.out.println(0);
        } else {
            String[] str = s.split("\\s+");
            System.out.println(str.length);
        }
    }
}
