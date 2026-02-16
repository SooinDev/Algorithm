import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringBuilder sb = new StringBuilder();

        String[] head = {"0", "1", "10", "11", "100", "101", "110", "111"};
        String[] body = {"000", "001", "010", "011", "100", "101", "110", "111"};

        if (s.equals("0")) {
            bw.write("0");
        } else {
            int firstDigit = s.charAt(0) - '0';
            sb.append(head[firstDigit]);

            for (int i = 1; i < s.length(); i++) {
                int digit = s.charAt(i) - '0';
                sb.append(body[digit]);
            }

            bw.write(sb.toString());
        }

        bw.flush();
        bw.close();
        br.close();
    }
}