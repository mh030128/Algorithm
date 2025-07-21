package _1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int subjects = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = 0;
        double result = 0;
        for(int i = 0; i < subjects; i++) {
            int scores = Integer.parseInt(st.nextToken());
            M = Math.max(M, scores);
            result += scores;
        }
        System.out.println((result / M * 100) / subjects);
    }
}
