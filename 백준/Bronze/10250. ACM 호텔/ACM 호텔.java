import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String[] input = br.readLine().split(" ");
            int H = Integer.parseInt(input[0]);
            int W = Integer.parseInt(input[1]);
            int N = Integer.parseInt(input[2]);

            int floor = N % H == 0 ? H : N % H;
            int room = N % H == 0 ? N / H : N / H + 1;

            // 방 번호 출력 (형식: 층수 + 두자리 호수)
            System.out.printf("%d%02d\n", floor, room);
        }

        br.close();
    }
}