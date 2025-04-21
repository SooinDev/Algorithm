import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int answer = 0; // 소수의 개수

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        
        // n개의 숫자를 확인
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            
            // 1은 소수가 아님
            if (num == 1) continue;
            
            boolean isPrime = true;
            
            // 2부터 num의 제곱근까지 나누어 떨어지는지 확인
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            
            if (isPrime) {
                answer++;
            }
        }
        
        System.out.println(answer);
        br.close();
    }
}