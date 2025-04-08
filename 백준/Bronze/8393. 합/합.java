import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num, sum;
        num = Integer.parseInt(br.readLine());
        sum = (num * (num + 1)) / 2;
        System.out.println(sum);
    }
}
