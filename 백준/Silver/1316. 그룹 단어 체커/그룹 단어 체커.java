import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            if (isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    public static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26];    /* boolean 초기값 = false */
        char prev = 0;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if(ch != prev) {
                if(visited[ch - 'a']) {     /* false이면 실행하지 않고, 다음 문장으로 실행 */
                    return false;
                }
                visited[ch - 'a'] = true;
            }
            prev = ch;
        }
        return true;
    }
}
