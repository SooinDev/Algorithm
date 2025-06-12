import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        String binaryNumber1 = st.nextToken();
        String binaryNumber2 = st.nextToken();
        
        // BigInteger로 이진수를 10진수로 변환
        BigInteger decimalNumber1 = new BigInteger(binaryNumber1, 2);
        BigInteger decimalNumber2 = new BigInteger(binaryNumber2, 2);
        
        // 덧셈 수행
        BigInteger sum = decimalNumber1.add(decimalNumber2);
        
        // 결과를 이진수로 변환
        String binaryNumberSum = sum.toString(2);
        
        bw.write(binaryNumberSum);
        bw.newLine();
        
        br.close();
        bw.close();
    }
}