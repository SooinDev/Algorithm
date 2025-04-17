import java.util.Scanner;

public class Main {
    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();

        char answer = s.charAt(n - 1);

        System.out.println(answer);
    }

    public static void main(String[] args) {
        solution();
    }
}