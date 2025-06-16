import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            double n = Double.parseDouble(br.readLine());
            if (n == 0) break;
            
            // 행렬 크기 계산: 1 + n + n² + n³ + n⁴
            double size = 1 + n + Math.pow(n, 2) + Math.pow(n, 3) + Math.pow(n, 4);
            
            bw.write(String.format("%.2f\n", size));
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}