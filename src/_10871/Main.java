package _10871;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int findNum = scanner.nextInt();
        int numArr[] = new int[num];

        for(int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        for(int i = 0; i < numArr.length; i++) {
            if (numArr[i] < findNum) {
                System.out.print(numArr[i] + " ");
            }
        }

    }
}
