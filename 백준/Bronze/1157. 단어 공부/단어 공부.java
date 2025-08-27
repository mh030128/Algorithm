import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = scanner.next().toUpperCase(); // 대문자로 변환

        int[] count = new int[26];    // A-Z 알파벳개수 저장

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'A']++;
        }

        int max = -1;
        char result = '?';

        for(int i = 0; i < count.length; i++) {
            if(count[i] > max) {
                max = count[i];
                result = (char)(i + 'A');
            } else if (count[i] == max) {
                result = '?';
            }
        }
        System.out.println(result);
    }
}
