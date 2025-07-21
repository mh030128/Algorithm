package _10807;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int num = Integer.parseInt(br.readLine());
        int arrayNum[] = new int[num];
        st = new StringTokenizer(br.readLine());

        for(int i = 0; i < num; i++) {
            arrayNum[i] = Integer.parseInt(st.nextToken());
        }
        int findNum = Integer.parseInt(br.readLine());
        int count = 0 ;

        for(int i = 0; i < arrayNum.length; i++) {
            if(findNum == arrayNum[i]) {
                count++;
            }
        }
        System.out.println(count);
        br.close();
    }
}
