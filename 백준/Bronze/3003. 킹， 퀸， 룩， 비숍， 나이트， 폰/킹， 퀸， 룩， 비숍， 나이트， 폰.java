import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[] correct = {1, 1, 2, 2, 2, 8};
        int[] input = new int[6];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < input.length; i++) {
            input[i] = Integer.parseInt(st.nextToken());
        }

        for(int i = 0; i < input.length; i++) {
            System.out.print((correct[i] - input[i]) + " ");
        }
    }
}
