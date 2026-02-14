import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());

        if (a < 2 || (a == 2 && b < 18))
            bw.write("Before");         
        else if (a == 2 && b == 18)
            bw.write("Special");
        else
            bw.write("After");

        bw.flush();
        bw.close();
        br.close();
    }
}