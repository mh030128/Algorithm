import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int a;
		int b;
		
		StringTokenizer st;
		for(int i=1; i<=T; i++) {
			st = new StringTokenizer(br.readLine()," ");	// 공백 단위로 입력해 준 문자열을 공백단위로 분리
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			System.out.println("Case #" + i + ": " + a + " + " + b + " = " + (a+b));
		}
		br.close();
	}
}