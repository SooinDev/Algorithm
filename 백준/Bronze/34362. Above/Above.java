import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();

        double result = Double.parseDouble(text);
        sb.append(result - 0.3);

        System.out.print(sb);
    }

}