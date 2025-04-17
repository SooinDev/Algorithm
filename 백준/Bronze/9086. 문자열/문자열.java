import java.util.Scanner;

public class Main {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        int cases = scanner.nextInt();

        for (int i = 0; i < cases; i++) {
            String text = scanner.next();
            char answer1 = text.charAt(0);
            char answer2 = text.charAt(text.length() - 1);
            String answer = Character.toString(answer1) + Character.toString(answer2);
            System.out.println(answer);
        }
    }

    public static void main(String[] args) {
        solution();
    }
}