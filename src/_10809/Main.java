package _10809;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int[] positions = new int[26];

        for(int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for(int i = 0; i < s.length(); i++) {
            char target = s.charAt(i);
            int index = target - 'a';
            if(positions[index] == -1) {
                positions[index] = i;
            }
        }

        for(int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }
    }
}
