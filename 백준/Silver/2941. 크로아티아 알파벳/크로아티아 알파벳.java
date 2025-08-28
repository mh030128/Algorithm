import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String pattern : croatia) {
            word = word.replace(pattern, "#");
        }

        System.out.println(word.length());
    }
}
