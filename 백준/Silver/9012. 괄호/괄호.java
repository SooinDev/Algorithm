import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String parentheses = br.readLine();
            
            if (isVPS(parentheses)) {
                bw.write("YES\n");
            } else {
                bw.write("NO\n");
            }
        }

        bw.flush();
        bw.close();
    }
    
    // 올바른 괄호 문자열인지 확인하는 메소드
    public static boolean isVPS(String s) {
        int count = 0;  // 열린 괄호의 개수를 추적
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (c == '(') {
                count++;  // 열린 괄호를 만나면 카운트 증가
            } else if (c == ')') {
                count--;  // 닫힌 괄호를 만나면 카운트 감소
                
                // 닫힌 괄호가 열린 괄호보다 많아지면 잘못된 문자열
                if (count < 0) {
                    return false;
                }
            }
        }
        
        // 최종적으로 카운트가 0이어야 올바른 괄호 문자열
        return count == 0;
    }
}