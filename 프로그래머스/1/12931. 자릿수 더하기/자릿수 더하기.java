class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);

        //answer = (n / 1) % 10;         // 4
        //answer = (n / 10) % 10;        // 3
        //answer = (n / 100) % 10;       // 2

        for (int i = 1; i <= Math.pow(10, str.length() - 1); i = i * 10) {
            answer += (n / i) % 10;
        }

        System.out.println(answer);
        return answer;
    }
}