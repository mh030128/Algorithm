import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.next();
        String num2 = scanner.next();

        String reverseNum1 = new StringBuilder(num1).reverse().toString();
        String reverseNum2 = new StringBuilder(num2).reverse().toString();

        // 뒤집은 문자열 정수로 변환
        int nnum1 = Integer.parseInt(reverseNum1);
        int nnum2 = Integer.parseInt(reverseNum2);

        System.out.println(Math.max(nnum1, nnum2));
    }
}
