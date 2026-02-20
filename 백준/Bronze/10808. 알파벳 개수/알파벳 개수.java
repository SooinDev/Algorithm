import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();
        int[] arr = new int[26];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            arr[c - 'a']++;
        }

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }

        System.out.print(sb);
        br.close();
    }
}