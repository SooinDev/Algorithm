import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num1 = in.nextInt();
        int num2 = in.nextInt();
        
        // 최대공약수 (GCD) 계산
        int gcd = findGCD(num1, num2);
        System.out.println(gcd);
        
        // 최소공배수 (LCM) 계산
        int lcm = (num1 * num2) / gcd;
        System.out.println(lcm);
    }
    
    // 유클리드 알고리즘을 사용한 최대공약수 계산
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}