package _10950;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int array[] = new int[num];


        for(int i = 0; i < num; i++) {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            array[i] = num1 + num2;
        }


        /*for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }*/

        for (int i : array) {
            System.out.println(i);
        }

    }
}
