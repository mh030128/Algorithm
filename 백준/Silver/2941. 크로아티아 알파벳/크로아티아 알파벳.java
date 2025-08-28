import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int cnt = 0;

        for (String pattern : croatia) {
            word = word.replace(pattern, "#");
        }

        System.out.println(word.length());
    }
}
