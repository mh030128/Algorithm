import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		br.close();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				bw.write("*");
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}