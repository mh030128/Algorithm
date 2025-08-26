import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuffer sb = new StringBuffer(input);
        String reverse = sb.reverse().toString();

        if(input.equals(reverse)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
