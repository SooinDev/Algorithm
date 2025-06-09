import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int count = 0; // 찾은 종말의 수 개수
        int num = 666; // 666부터 시작

        while (true) {
            // 현재 수가 종말의 수인지 확인
            if (isApocalypseNumber(num)) {
                count++;
                // N번째 종말의 수를 찾았으면 출력하고 종료
                if (count == N) {
                    bw.write(num + "\n");
                    break;
                }
            }
            num++; // 다음 수로 이동
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 666이 연속으로 포함되어 있는지 확인하는 함수
    public static boolean isApocalypseNumber(int num) {
        String str = Integer.toString(num);
        return str.contains("666");
    }
}