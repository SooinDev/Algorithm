import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();

        if ((str.length() <= 10 && str.length() >= 1) && (n>=1 && n<=5)) {
            for (int i = 0; i < n; i++) {
                System.out.print(str);
            }
        }
        else {
            System.out.println("재입력");
        }
    }
}