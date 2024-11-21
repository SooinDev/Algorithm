class Solution {
    public long solution(long n) {
        long answer = 0;

        for (int i = 1; i <= n; i++) {
            if (n == Math.pow(i, 2)) {
                answer = (long)Math.pow(i + 1, 2);
                break;
            } else {
                answer = -1;
            }
        }
        System.out.println(answer);

        return answer;
    }
}