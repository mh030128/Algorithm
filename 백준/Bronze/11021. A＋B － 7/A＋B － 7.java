import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		for(int i=1; i<=a; i++) {
			st = new StringTokenizer(br.readLine()," ");	// 공백 단위로 입력해 준 문자열을 공백단위로 분리
			System.out.println("Case #" + i + ": " + 
			(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())));
		}
		br.close();
	}
}