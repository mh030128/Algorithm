import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        HashSet<Integer> nums = new HashSet<>();

        for(int i = 0; i < 10; i++) {
            int num = scanner.nextInt();
            nums.add(num % 42);
        }
        System.out.println(nums.size());
    }
}
