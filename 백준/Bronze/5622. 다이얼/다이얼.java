import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int total = 0;

        for (int i = 0; i < input.length(); i++) {
            total += dial(input.charAt(i));
        }
        System.out.println(total);
    }

    private static int dial(int ASCII) {
        if (ASCII >= 'A' && ASCII <= 'C') return 3;
        if (ASCII <= 'F') return 4;
        if (ASCII <= 'I') return 5;
        if (ASCII <= 'L') return 6;
        if (ASCII <= 'O') return 7;
        if (ASCII <= 'S') return 8;
        if (ASCII <= 'V') return 9;
        if (ASCII <= 'Z') return 10;

        return 0;
    }
}
