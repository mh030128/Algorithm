import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int subjects = Integer.parseInt(st.nextToken());
        int[] scores = new int[subjects];
        // double[] changeScores = new double[subjects];

        // 점수입력
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < subjects; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        // 최대값 구하기
        int M = scores[0];
        for(int i = 1; i < subjects; i++) {
            if(scores[i] > M) {
                M = scores[i];
            }
        }

        // 새로운 점수로 평균 구하기
        double sum = 0;
        for(int i = 0; i < subjects; i++) {
            sum += (double) scores[i] / M * 100;
        }

        double avg = sum / subjects;
        System.out.println(avg);
    }
}
