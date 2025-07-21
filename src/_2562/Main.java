package _2562;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numArr[] = new int[9];
        int max = 0;
        int count = 0;


        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = scanner.nextInt();
            if(max < numArr[i]) {
                max = numArr[i];
                count = i + 1;
            }
        }
        System.out.println(max + "\n" + count);


    }
}
