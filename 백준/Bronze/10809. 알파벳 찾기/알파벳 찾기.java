import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine(); // 단어 s 입력 받기

        // a부터 z까지 각 알파벳의 첫 등장 위치 찾기
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.print(s.indexOf(c) + " "); // indexOf는 문자가 없으면 -1 반환
        }

        br.close(); // 사용 후 BufferedReader 닫기
    }
}