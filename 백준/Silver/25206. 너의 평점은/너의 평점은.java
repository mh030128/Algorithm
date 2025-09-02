import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double totalScore = 0.0;    /* 학점 * 과목평점 */
        double totalScoreP = 0.0; /* P제외 점수 */

        for(int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            st.nextToken(); /* 과목명은 계산에 사용하지 않으므로 바로 넘김. */
            double score = Double.parseDouble(st.nextToken()); /* 학점 */
            String grade = st.nextToken(); /* 등급 */

            double majorScore = 0.0; /* 과목평점 */
            switch (grade) {
                case "A+" : majorScore = 4.5; break;
                case "A0" : majorScore = 4.0; break;
                case "B+" : majorScore = 3.5; break;
                case "B0" : majorScore = 3.0; break;
                case "C+" : majorScore = 2.5; break;
                case "C0" : majorScore = 2.0; break;
                case "D+" : majorScore = 1.5; break;
                case "D0" : majorScore = 1.0; break;
                case "F" : majorScore = 0.0; break;
                case "P" : continue;    /* P학점 제외 */
            }
            totalScore += (score * majorScore);
            totalScoreP += score;
        }
        System.out.printf("%.6f\n", totalScore / totalScoreP);
    }
}
