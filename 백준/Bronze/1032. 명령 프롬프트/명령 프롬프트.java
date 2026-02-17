import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String firstFile = br.readLine();
        char[] pattern = firstFile.toCharArray();

        for (int i = 1; i < n; i++) {
            String fileName = br.readLine();

            for (int j = 0; j < firstFile.length(); j++) {
                if (pattern[j] != fileName.charAt(j)) {
                    pattern[j] = '?';
                }
            }
        }

        bw.write(pattern);

        bw.flush();
        bw.close();
        br.close();
    }
}