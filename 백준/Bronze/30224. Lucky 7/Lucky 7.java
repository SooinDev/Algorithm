import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String num = br.readLine();
        int numInt = Integer.parseInt(num);

        // 7이 포함되어 있는지 확인
        boolean contains7 = num.contains("7");

        // 7로 나누어떨어지는지 확인
        boolean divisibleBy7 = (numInt % 7 == 0);

        int result;
        if (!contains7 && !divisibleBy7)
            result = 0;
        else if (!contains7 && divisibleBy7)
            result = 1;
        else if (contains7 && !divisibleBy7)
            result = 2;
        else // contains7 && divisibleBy7
            result = 3;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}