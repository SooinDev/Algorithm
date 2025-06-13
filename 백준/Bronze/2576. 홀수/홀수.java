import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> list = new ArrayList<Integer>();

        for (int i = 0; i < 7; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 1) {
                list.add(num);
            }
            // else 부분 제거 - 짝수여도 flag를 바꾸지 않음
        }

        if (list.size() > 0) {  // 홀수가 하나라도 있으면
            Collections.sort(list);
            int sum = 0;

            for (int i = 0; i < list.size(); i++)
                sum += list.get(i);

            bw.write(sum + "\n");
            bw.write(list.get(0).toString());
        }
        else {  // 홀수가 하나도 없으면
            bw.write("-1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}