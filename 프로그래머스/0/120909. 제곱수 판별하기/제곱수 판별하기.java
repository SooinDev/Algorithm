class Solution {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (Math.pow(i, 2) == n) {
                answer = 1;
            } else {
                answer = 2;
            }
        }
        System.out.println(answer);

        return answer;
    }
}