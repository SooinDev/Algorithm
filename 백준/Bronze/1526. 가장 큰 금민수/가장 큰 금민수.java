import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // N부터 시작해서 아래로 내려가며 검사
        for (int i = N; i >= 4; i--) {
            if (isGoldNumber(i)) {
                bw.write(i + "\n");
                break; // 첫 번째로 찾은 것이 가장 큰 금민수
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    // 4와 7로만 이루어진 수인지 확인하는 함수
    public static boolean isGoldNumber(int num) {
        String str = Integer.toString(num);
        for (int i = 0; i < str.length(); i++) {
            char digit = str.charAt(i);
            if (digit != '4' && digit != '7') {
                return false; // 4나 7이 아닌 숫자가 있으면 false
            }
        }
        return true; // 모든 자릿수가 4 또는 7이면 true
    }
}