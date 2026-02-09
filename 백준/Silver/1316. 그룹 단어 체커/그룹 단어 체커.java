import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = br.readLine();

            boolean[] visited = new boolean[26];
            boolean isGroupWord = true;
            int prev = 0;

            for (int j = 0; j < word.length(); j++) {
                int now = word.charAt(j);

                if (prev != now) {

                    if (visited[now - 'a'] == true) {
                        isGroupWord = false;
                        break;
                    }

                    visited[now - 'a'] = true;
                    prev = now;
                }

            }

            if (isGroupWord) {
                count++;
            }

        }

        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();
    }
}