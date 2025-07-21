package _1546;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int subjects = scanner.nextInt();
        int[] scores = new int[subjects];
        /*double[] changeScores = new double[totalSubject];
        double sum = 0;
        double avg = 0;*/

        for(int i = 0; i < subjects; i++) {
            scores[i] = scanner.nextInt();
        }

        // 최대값 구하기
        int M = scores[0];
        for(int i = 1; i < subjects; i++) {
            if(scores[i] > M) {
                M = scores[i];
            }
        }

        double sum = 0;
        for(int i = 0; i < subjects; i++) {
            sum += (double) scores[i] / M * 100;
        }

        double avg = sum / subjects;
        System.out.println(avg);
    }
}
