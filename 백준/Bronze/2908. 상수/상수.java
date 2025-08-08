import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        br.close();

        int num1 = Integer.parseInt(new StringBuilder().append(str[0]).reverse().toString());
        int num2 = Integer.parseInt(new StringBuilder().append(str[1]).reverse().toString());

        System.out.println(Math.max(num1, num2));
    }
}
