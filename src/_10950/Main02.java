package _10950;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main02 {
    public static void main(String[] args) throws IOException {

        // 사용자에게 입력받을 도구 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 사용자에게 입력받은 횟수에 대한 변수 생성
        int num = Integer.parseInt(br.readLine());

        // 문자열 저장 객체
        StringBuilder sb = new StringBuilder();

        // 반복문 돌면서 입력받은 숫자들 저장
        for(int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
