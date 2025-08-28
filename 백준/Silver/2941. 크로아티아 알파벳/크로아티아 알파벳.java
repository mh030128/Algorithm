import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        /* 정규식 한 번에 치환*/
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        /* dz를 가장 먼저 둬야 함
        * z=을 먼저 치환하면 dz=으로 치환하지 못하기 때문
        * replace는 문자열 치환, 정규식이 아니고
        * replaceAll은 정규식이므로 패턴을 잘 사용해야 함.*/

        word = word.replaceAll("dz=|c=|c-|d-|lj|nj|s=|z=", "#");
        System.out.println(word.length());
    }
}
