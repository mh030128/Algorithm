package _10809;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int[] positions = new int[26];
        Arrays.fill(positions, -1);

        char[] target = br.readLine().toCharArray();
        for(int i = 0; i < target.length; i++) {
            char c = target[i];
            if (positions[c - 'a'] == -1) {
                positions[c - 'a'] = i;
            }
        }

        for(int i = 0; i < positions.length; i++) {
            sb.append(positions[i]).append(" ");
        }
        System.out.println(sb);
    }
}
