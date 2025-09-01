import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 0 ; i < n; i++) {
            String word = br.readLine();
            if(isGroupWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static boolean isGroupWord(String word) {
        boolean[] visit = new boolean[26];
        char prev = 0;

        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(ch != prev) {
                if(visit[ch - 'a']) {
                    return false;
                }
                visit[ch - 'a'] = true;
            }
            prev = ch;
        }
        return true;
    }
}
