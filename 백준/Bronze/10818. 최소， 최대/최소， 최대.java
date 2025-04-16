import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(st.nextToken());
        int numArr[] = new int[num];

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < num; i++) {
            numArr[i] = Integer.parseInt(st.nextToken());
        }

        int max = numArr[0];
        int min = numArr[0];

        for(int i = 0; i < num; i++) {
            if(max < numArr[i]) {
                max = numArr[i];
            }
            if(min > numArr[i]) {
                min = numArr[i];
            }
        }
        System.out.println(min + " " + max);
        br.close();
    }
}
