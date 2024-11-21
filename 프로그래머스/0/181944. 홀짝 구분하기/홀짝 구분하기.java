import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if ((a >= 1) && (a <= 1000)) {
            if ((a % 2) == 0) {
                System.out.println(a + " is even");
            } else {
                System.out.println(a + " is odd");
            }
        }
        else {

        }
    }
}