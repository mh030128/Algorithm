import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> lines = new ArrayList<>();
        String input;

        while((input = br.readLine()) != null) {
            lines.add(input);   // 배열에 한 줄씩 추가
        }

        for (String str : lines) {
            System.out.println(str);
        }
    }
}
