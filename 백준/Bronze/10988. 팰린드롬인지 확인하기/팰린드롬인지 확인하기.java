import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuffer sb = new StringBuffer(input);
        String reverse = sb.reverse().toString();

        System.out.println(input.equals(reverse) ? 1 : 0);
    }
}
