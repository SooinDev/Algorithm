import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 객체 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 서로 다른 나머지 값을 저장할 HashSet 생성
        HashSet<Integer> remainders = new HashSet<>();

        // 10개의 수를 입력받아 처리
        for (int i = 0; i < 10; i++) {
            // 입력값을 정수로 변환하고 42로 나눈 나머지를 HashSet에 추가
            int num = Integer.parseInt(br.readLine());
            remainders.add(num % 42);
        }

        // HashSet의 크기(서로 다른 나머지의 개수) 출력
        System.out.println(remainders.size());

        // BufferedReader 닫기
        br.close();
    }
}