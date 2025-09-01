import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static boolean isGroupWord(String word) {
        boolean groupWord = true;   /* 입력받은 단어가 그룹단어라고 가정 */

        for(int i = 0; i < word.length()-1; i++) {
            if(word.charAt(i) != word.charAt(i+1)) {
                for(int j = i + 1; j < word.length(); j++) {
                    if(word.charAt(i) == word.charAt(j)) {
                        groupWord = false;
                    }
                }
            }
        }
        return groupWord;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] word = new String[n];
        int count = 0;

        for(int i = 0; i < n; i++) {
            if(isGroupWord(br.readLine())) {
                count++;
            }
        }
        System.out.println(count);
    }
}
