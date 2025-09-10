import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] arr = new String[5];

        for(int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextLine();
        }

        int maxLen = 0;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i].length() > maxLen) {
                maxLen = arr[i].length();
            }
        }

        for(int i = 0; i < maxLen; i++) {
            for(int j = 0; j < 5; j++) {
                if(i < arr[j].length()) {
                    System.out.print(arr[j].charAt(i));
                }
            }
        }
    }
}
