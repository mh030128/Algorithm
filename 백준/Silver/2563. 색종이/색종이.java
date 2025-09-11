import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();    /* 색종이 개수 */
        int[][] paper = new int[100][100];  /*100 x 100 크기 */
        int area = 0;

        for(int i = 0; i < num; i++) {  /* 좌측 하단 모서리 좌표 */
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            for(int j = x; j < x + 10; j++) {
                for(int k = y; k < y + 10; k++) {
                    paper[j][k] = 1;
                }
            }
        }

        for(int i = 0; i < paper.length; i++) {
            for(int j = 0; j < paper.length; j++) {
                if(paper[i][j] == 1) {
                    area++;
                }
            }
        }
        System.out.println(area);
    }
}
