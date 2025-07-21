package _5597;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] student = new boolean[31];

        for(int i = 0; i < 28; i++) {
            int stuNum = Integer.parseInt(br.readLine());
            student[stuNum] = true;
        }

        for(int i = 1; i <= 30; i++) {
            if(!student[i]) {
                System.out.println(i);
            }
        }
    }
}
