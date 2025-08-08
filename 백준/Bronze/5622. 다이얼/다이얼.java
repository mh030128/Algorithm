import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();

        // 문자 → 걸리는 시간(초) 매핑
        Map<Character, Integer> dialMap = new HashMap<>();
        dialMap.put('A', 3); dialMap.put('B', 3); dialMap.put('C', 3);
        dialMap.put('D', 4); dialMap.put('E', 4); dialMap.put('F', 4);
        dialMap.put('G', 5); dialMap.put('H', 5); dialMap.put('I', 5);
        dialMap.put('J', 6); dialMap.put('K', 6); dialMap.put('L', 6);
        dialMap.put('M', 7); dialMap.put('N', 7); dialMap.put('O', 7);
        dialMap.put('P', 8); dialMap.put('Q', 8); dialMap.put('R', 8); dialMap.put('S', 8);
        dialMap.put('T', 9); dialMap.put('U', 9); dialMap.put('V', 9);
        dialMap.put('W', 10); dialMap.put('X', 10); dialMap.put('Y', 10); dialMap.put('Z', 10);

        int total = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            total += dialMap.get(ch);  // 해당 문자에 해당하는 시간 더함
        }

        System.out.println(total);
    }
}