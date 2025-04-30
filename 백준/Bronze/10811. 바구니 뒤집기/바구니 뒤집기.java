import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int basketNum = Integer.parseInt(st.nextToken());
        int[] basket = new int[basketNum];
        int inverseNum = Integer.parseInt(st.nextToken());

        for(int i = 0; i < basket.length; i++) {
            basket[i] = i + 1;
        }

        for(int i = 0; i < inverseNum; i++) {
            st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken()) - 1;
            int num2 = Integer.parseInt(st.nextToken()) - 1;

            while(num1 < num2) {
                int temp = basket[num1];
                basket[num1] = basket[num2];
                basket[num2] = temp;

                num1++;
                num2--;
            }
        }
        for(int i = 0; i < basket.length; i++) {
            System.out.print(basket[i] + " ");
        }
    }
}
