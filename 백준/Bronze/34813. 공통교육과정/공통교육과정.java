import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String text = br.readLine();
        char[] arr = text.toCharArray();

        if (arr[0] == 'F')
            sb.append("Foundation");
        else if (arr[0] == 'C')
            sb.append("Claves");
        else if (arr[0] == 'V')
            sb.append("Veritas");
        else if (arr[0] == 'E')
            sb.append("Exploration");

        System.out.print(sb);
    }

}