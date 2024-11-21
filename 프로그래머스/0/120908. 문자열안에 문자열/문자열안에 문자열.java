class Solution {
    public int solution(String str1, String str2) {
        int answer = 0;

        if (str1.contains(str2)) {
            answer = 1;
            System.out.println(answer);
        }
        else {
            answer = 2;
            System.out.println(answer);
        }

        return answer;
    }
}