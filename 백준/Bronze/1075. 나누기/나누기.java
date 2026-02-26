import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int f = Integer.parseInt(br.readLine());

        int base = (n / 100) * 100; // 마지막 두 자리 00으로 만들기
        int answer = 0;

        for (int x = 0; x < 100; x++) { // 00부터 99까지
            if ((base + x) % f == 0) {
                answer = x;
                break;
            }
        }

        if (answer < 10)
            sb.append("0" + answer);
        else
            sb.append(answer);

        System.out.print(sb);
        br.close();
    }
}