class Solution {
    public int solution(int n, int t) {
        int answer = 0;

        // 0 = 7
        // 1 = 14
        // 2 = 28
        // 3 = 56
        // 4 = 112

        // 1 = 7    7 * 1 = n *
        // 2 = 14   7 * 2 = n * (2의 1승)
        // 3 = 28   7 * 4 = n * (2의 2승)
        // 4 = 56   7 * 8 = n * (2의 3승)

        for (int i = 1; i <= t; i++) {
            answer = n * (int)Math.pow(2, t);
        }
        System.out.println(answer);

        return answer;
    }
}