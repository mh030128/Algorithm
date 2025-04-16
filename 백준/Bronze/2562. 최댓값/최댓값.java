import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numArr[] = new int[9];
        int max = 0;
        int count = 0;

        for(int i = 0; i < numArr.length; i++) {
            numArr[i] = Integer.parseInt(br.readLine());

            if(max < numArr[i]) {
                max = numArr[i];
                count = i + 1;
            }
        }
        System.out.println(max + "\n" + count);
    }
}
