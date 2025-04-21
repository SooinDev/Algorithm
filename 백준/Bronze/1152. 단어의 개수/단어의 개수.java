import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String sentence = in.nextLine();
        in.close();

        StringTokenizer st = new StringTokenizer(sentence," ");

        System.out.println(st.countTokens());
    }
}