import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;

        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt((n.length() - 1) - i);
            int result;
            if (c >= 'A' && c <= 'Z') {
                result = c - 55;
            } else {
                result = c - '0';
            }
            sum += (int) Math.pow(b, i) * result;
        }
        sb.append(sum);
        System.out.println(sb);
    }
}
