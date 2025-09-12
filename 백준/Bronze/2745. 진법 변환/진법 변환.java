import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        int d = 1;

        for(int i = n.length() - 1; i >= 0; i--) {
            char c = n.charAt(i);
            int result = c >= 'A' && c <= 'Z' ? c - 55 : c - '0';
            sum += result * d;
            d = d * b;
        }
        System.out.println(sum);
    }
}
