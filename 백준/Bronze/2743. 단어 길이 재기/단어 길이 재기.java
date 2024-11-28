import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        String str;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        str = br.readLine();

        br.close();

        System.out.println(str.length());
    }
}