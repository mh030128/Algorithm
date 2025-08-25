import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < input.length; i++) {
            input[i] = chess[i] - Integer.parseInt(st.nextToken());
            sb.append(input[i]).append(" ");
        }
        System.out.println(sb);
    }
}
