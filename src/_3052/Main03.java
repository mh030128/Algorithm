package _3052;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main03 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int n, count = 0;

        for(int i = 0; i < arr.length; i++) {
            n = Integer.parseInt(br.readLine()) % 42;
            for(int j = 0; j < i; j++) {
                if(n == arr[j]) {
                    count++;
                    break;
                }
            }
            arr[i] = n;
        }
        System.out.println(10 - count);
        br.close();

    }
}
