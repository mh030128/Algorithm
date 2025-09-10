import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] arr = new String[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = br.readLine();
        }

        int maxLen = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > maxLen) {
                maxLen = arr[i].length();
            }
        }

        for(int i = 0; i < maxLen; i++) {
            for(int j = 0; j < 5; j++) {
                if(i < arr[j].length()) {
                    sb.append(arr[j].charAt(i));
                }
            }
        }
        System.out.println(sb);
    }
}
