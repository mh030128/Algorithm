import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        /* 문자열 직접 탐색 */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder sb = new StringBuilder(word); // String 타입의 문자열로 인자를 하는 생성자.

        int cnt = 0;

        for(int i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);

            // 1) dz= (세 글자)
            if(ch == 'd' && i + 2 < sb.length() // d로 시작하면서, 뒤에 두 글자 더 있어야 함을 의미
                    && sb.charAt(i + 1) == 'z'
                    && sb.charAt(i + 2) == '=') {
                cnt++;
                i += 2; // i++로 인해 i가 3칸 건너뛰어짐.
            }
            // 2) c=, c-
            /* &&보다 || 우선순위가 더 높음.
            * 따라서 c 이면서 = 또는 -여야 하므로 =와 - 사이에 괄호를 입력*/
            else if (ch == 'c' && i + 1 < sb.length()
                            && (sb.charAt(i + 1) == '='
                            || sb.charAt(i + 1) == '-')) {
                cnt++;
                i++;
            }
            // 3) d-
            else if (ch == 'd' && i + 1 < sb.length() && sb.charAt(i + 1) == '-') {
                cnt++;
                i++;
            }
            // 4) lj
            else if (ch == 'l' && i + 1 < sb.length() && sb.charAt(i + 1) == 'j') {
                cnt++;
                i++;
            }
            // 5) nj
            else if (ch == 'n' && i + 1 < sb.length() && sb.charAt(i + 1) == 'j') {
                cnt++;
                i++;
            }
            // 6) s=, z=
            else if ((ch == 's' || ch == 'z') && i + 1 < sb.length() && sb.charAt(i + 1) == '=') {
                cnt++;
                i++;
            } else {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
