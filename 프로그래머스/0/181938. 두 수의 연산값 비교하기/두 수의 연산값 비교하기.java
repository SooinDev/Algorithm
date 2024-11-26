class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String aString = Integer.toString(a);
        String bString = Integer.toString(b);
        String abString = aString + bString;

        if (Integer.parseInt(abString) > (2 * a * b)) {
            answer = Integer.parseInt(abString);
            return answer;
        } else if (Integer.parseInt(abString) < (2 * a * b)) {
            answer = 2 * a * b;
            return answer;
        } else if (Integer.parseInt(bString) == (2 * a * b)) {
            answer = Integer.parseInt(abString);
            return answer;
        }

        return answer;
    }
}