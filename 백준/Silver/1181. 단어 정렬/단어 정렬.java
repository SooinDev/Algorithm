import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        // Set을 사용하여 중복 자동 제거
        Set<String> wordSet = new HashSet<>();

        // 입력받으면서 Set에 저장 (중복 자동 제거)
        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            wordSet.add(word);
        }

        // Set을 List로 변환 (정렬을 위해)
        List<String> words = new ArrayList<>(wordSet);

        // 정렬: 1순위 길이, 2순위 사전순
        Collections.sort(words, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                if (a.length() != b.length()) {
                    return a.length() - b.length(); // 길이 순으로 정렬
                }
                return a.compareTo(b);               // 길이가 같으면 사전순
            }
        });

        // 결과 출력
        for (String word : words) {
            bw.write(word + "\n");
        }

        bw.flush();
        bw.close();
    }
}