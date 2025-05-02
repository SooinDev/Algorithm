import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // A, B, C 입력 받기
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        // 수로 생각했을 때
        System.out.println(A + B - C);

        String aText = Integer.toString(A);
        String bText = Integer.toString(B);
        String aPlusB = aText + bText;
        int aPlusBInt = Integer.parseInt(aPlusB);

        // 문자열로 생각했을 때
        System.out.println(aPlusBInt - C);

        br.close();
    }
}