import java.io.*;

public class Main {
    static private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static private BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int[][] arr = new int[9][9];
        int max = 0;
        int maxRow = 1, maxCol = 1;

        for(int i = 0; i < arr.length; i++) {
            String line = br.readLine();
            String[] token = line.split(" ");
            for(int j = 0; j < token.length; j++) {
                arr[i][j] = Integer.parseInt(token[j]);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j <arr[0].length; j++) {
                if(arr[i][j] > max) {
                    max = arr[i][j];
                    maxRow = i + 1;
                    maxCol = j + 1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(maxRow).append(" ").append(maxCol);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
