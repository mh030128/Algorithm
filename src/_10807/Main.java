package _10807;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();    // 정수 개수 n개
        int arrayNum[] = new int[num];

        for(int i = 0; i < num; i++) {
            arrayNum[i] = scanner.nextInt();
        }
        int findNum = scanner.nextInt();
        int count = 0;
        for(int i = 0; i < num; i++) {
            if(findNum == arrayNum[i]) {
                count++;
            }
        }
        System.out.println(count);
    }
}
