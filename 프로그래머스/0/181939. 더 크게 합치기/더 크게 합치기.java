class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String a1 = Integer.toString(a);
        String b1 = Integer.toString(b);
        String total1 = a1 + b1;
        String total2 = b1 + a1;
        int result1 = Integer.parseInt(total1);
        int result2 = Integer.parseInt(total2);

        if (result1 > result2) {
            System.out.println(result1);
            return result1;
        } else if (result2 > result1) {
            System.out.println(result2);
            return result2;
        } else if (result1 == result2) {
            System.out.println(result1);
            return result1;
        }

        return answer;
    }
}