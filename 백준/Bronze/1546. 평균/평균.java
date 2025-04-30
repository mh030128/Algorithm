import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int totalSubject = scanner.nextInt();
        int[] scores = new int[totalSubject];
        double[] changeScores = new double[totalSubject];
        double sum = 0;
        double avg = 0;

        for(int i = 0; i < totalSubject; i++) {
            scores[i] = scanner.nextInt();
        }

        // 최대값 구하기
        int M = scores[0];
        for(int i = 1; i < totalSubject; i++) {

            if(scores[i] > M) {
                M = scores[i];
            }
        }

        for(int i = 0; i < totalSubject; i++) {
            changeScores[i] = ((double)scores[i] / M) * 100;
            sum += (double) changeScores[i];
            avg = (double) (sum / totalSubject);
        }
        System.out.println(avg);
    }
}
