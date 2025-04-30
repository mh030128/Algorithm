import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hi = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            hi.add(num % 42);
        }
        System.out.println(hi.size());
    }
}
