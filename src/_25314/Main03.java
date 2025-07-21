package _25314;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) throws IOException {

        final int BYTES_PER_LONG = 4;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int repeat = num / BYTES_PER_LONG;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < repeat; i++) {
            sb.append("long ");
        }
        sb.append("int");
        System.out.println(sb);
    }
}
