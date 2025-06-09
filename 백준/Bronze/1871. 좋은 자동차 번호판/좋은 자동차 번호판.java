import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String number = br.readLine();
            String[] arr = number.split("-");

            String letters = arr[0]; // 문자 부분 (예: "ABC")
            String digits = arr[1];  // 숫자 부분 (예: "0123")

            // 문자 부분의 가치 계산 (26진법)
            int letterValue = 0;
            for (int j = 0; j < 3; j++) {
                int charValue = letters.charAt(j) - 'A'; // A=0, B=1, ..., Z=25
                letterValue += charValue * Math.pow(26, 2 - j); // 26^2, 26^1, 26^0
            }

            // 숫자 부분의 가치 (그냥 정수로 변환)
            int digitValue = Integer.parseInt(digits);

            // 차이가 100 이하인지 확인
            if (Math.abs(letterValue - digitValue) <= 100) {
                bw.write("nice\n");
            } else {
                bw.write("not nice\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}