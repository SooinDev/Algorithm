import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
        }

        int answer = total - sum;
        String answerString = String.valueOf(answer);
        
        bw.write(answerString);
        bw.flush();
        bw.close();
        br.close();
    }
}