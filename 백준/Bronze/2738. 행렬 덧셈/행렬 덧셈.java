import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] result = new int[N][M];

        for(int m = 0; m < 2; m++) {    /* 행렬A, 행렬B가 있으므로 총 2번 도는 것을 의미 */
            for(int i = 0; i < result.length; i++) {
                st = new StringTokenizer(br.readLine());
                for(int j = 0; j < result[0].length; j++) {
                    result[i][j] += Integer.parseInt(st.nextToken());
                }
            }
        }

        for(int i = 0; i < result.length; i++) {
            for(int j = 0; j < result[0].length; j++) {
                sb.append(result[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
