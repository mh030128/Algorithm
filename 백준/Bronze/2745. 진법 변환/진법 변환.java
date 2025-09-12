import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String n = scanner.next();
        int b = scanner.nextInt();   /* b진법 */
        int sum = 0;
        int result = 0;

        for(int i = 0; i < n.length(); i++) {
            char c = n.charAt((n.length()-1)-i);
            if(c >= 'A' && c <= 'Z') {
                result = c - 55;
            } else {
                result = c - '0';
            }
            sum += (int)Math.pow(b, i) * result;    /* Math.pow() 함수는 double로 return하기 때문에 int로 형변환해줘야 함. */
        }
        System.out.println(sum);
    }
}
