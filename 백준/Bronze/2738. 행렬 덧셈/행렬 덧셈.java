import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[][] arrA = new int[n][m];   /* 첫 번째 행렬 */
        int[][] arrB = new int[n][m];   /* 두 번째 행렬 */

        /* 첫 번째 행렬 원소 */
        for(int i = 0; i < arrA.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arrA[i].length; j++) {
                arrA[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        
        /* 두 번째 행렬 원소 */
        for(int i = 0; i < arrB.length; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < arrB[i].length; j++) {
                arrB[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        /* 두 행렬 더하기 */
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < arrA.length; i++) {
            for(int j = 0; j < arrA[0].length; j++) {
                sb.append(arrA[i][j] + arrB[i][j]).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
