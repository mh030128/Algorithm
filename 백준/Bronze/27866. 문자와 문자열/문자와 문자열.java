import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String S;
        int i;

        Scanner sc = new Scanner(System.in);
        S = sc.next();
        i = sc.nextInt()-1;

        System.out.println(S.charAt(i));

        sc.close();
    }
}