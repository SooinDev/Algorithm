import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A 배열 입력
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<Integer> aSet = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            aSet.add(Integer.parseInt(st.nextToken()));
        }

        // M 배열 입력 및 검사
        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();  // 출력 최적화

        for (int i = 0; i < m; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (aSet.contains(num)) {
                sb.append("1\n");
            } else {
                sb.append("0\n");
            }
        }

        System.out.print(sb);
    }
}