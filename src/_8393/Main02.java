package _8393;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*int num = Integer.parseInt(br.readLine());
        int sum = 0;

        for(int i = 1; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);*/

        int num = Integer.parseInt(br.readLine());
        int sum = (num * (num + 1)) / 2;
        System.out.println(sum);
    }
}
