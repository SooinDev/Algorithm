import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine().toUpperCase(); // 대문자로 변환
        int[] count = new int[26]; // A~Z 개수를 저장할 배열

        // 각 알파벳 개수 세기
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            count[ch - 'A']++; // A=0, B=1, ..., Z=25 인덱스로 변환
        }

        // 최댓값과 해당 알파벳 찾기
        int maxCount = 0;
        char result = '?';

        for (int i = 0; i < 26; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                result = (char)(i + 'A'); // 인덱스를 다시 알파벳으로 변환
            } else if (count[i] == maxCount && maxCount > 0) {
                result = '?'; // 같은 최댓값이 또 나오면 ?
            }
        }

        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}