import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        // 위쪽삼각형
        for(int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i))    // 공백출력
                .append("*".repeat(2 * i - 1))  // 별출력
                    .append("\n");
        }

        // 아래쪽삼각형
        for(int i = n - 1; i >= 1; i--) {
            sb.append(" ".repeat(n - i))    // 공백출력
                .append("*".repeat(2 * i - 1))  // 별출력
                    .append("\n");
        }
            
        // 최종출력
        System.out.println(sb);
    }

}
