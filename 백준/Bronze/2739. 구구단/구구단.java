import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for(int i = num; i <= num; i++) {
            for(int j = 1; j < 10; j++) {
                System.out.println(num + " * " + j + " = " + num*j);
            }
            System.out.println();
        }
    }
}