import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[][] arr = new char[5][15];
        int maxLen = 0;

        for(int i = 0; i < arr.length; i++) {
            String str = br.readLine();

            for(int j = 0; j < str.length(); j++) {
                arr[i][j] = str.charAt(j);
            }
            maxLen = Math.max(maxLen, str.length());
        }

        for(int i = 0; i < maxLen; i++) {
            for(int j = 0; j < 5; j++) {
                if(arr[j][i] != '\0') {
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
