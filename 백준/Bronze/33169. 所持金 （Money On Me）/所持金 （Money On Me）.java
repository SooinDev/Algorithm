import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int aMoney = A * 1000;
        int bMoney = B * 10000;
        int result = aMoney + bMoney;
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}