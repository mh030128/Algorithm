package _10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] positions = new int[26];

        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i <s.length(); i++) {
            char target = s.charAt(i);
            int index = target - 'a';
            if(positions[index] == -1) {
                positions[index] = i;
            }
        }

        /*for(int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }*/

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < positions.length; i++) {
            sb.append(positions[i]).append(" ");
        }
        System.out.println(sb);
    }
}
