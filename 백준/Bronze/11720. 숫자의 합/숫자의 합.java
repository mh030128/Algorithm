import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(bufferedReader.readLine());
        String str = bufferedReader.readLine();

        int sum = 0;

        for(int i = 0; i < number; i++) {
            sum += str.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
