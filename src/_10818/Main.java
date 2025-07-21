package _10818;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int numArr[] = new int[num];


        for(int i = 0; i < num; i++) {
            numArr[i] = scanner.nextInt();
        }

        int max = numArr[0];
        int min = numArr[0];

        for(int i = 0; i < num; i++) {

            if(max < numArr[i]) {
                max = numArr[i];
            }
            if(min > numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}
