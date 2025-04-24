import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Set<Integer> students = new HashSet<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 1; i <= 30; i++) {
            students.add(i);
        }

        for(int i = 0; i < 28; i++) {
            int stuNum = Integer.parseInt(br.readLine());
            students.remove(stuNum);
        }

        List<Integer> result = new ArrayList<>(students);
        Collections.sort(result);

        for (Integer n : result) {
            System.out.println(n);
        }
    }
}
