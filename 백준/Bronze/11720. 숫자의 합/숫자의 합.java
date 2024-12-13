import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();
        String num = scanner.next();
        scanner.close();

        int sum = 0;

        for(int i = 0; i < number; i++) {
            sum += num.charAt(i) - '0';
        }
        System.out.println(sum);
    }
}
