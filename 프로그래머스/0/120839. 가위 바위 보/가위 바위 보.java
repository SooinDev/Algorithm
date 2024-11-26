import java.util.Arrays;

class Solution {
    public String solution(String rsp) {
        String answer = "";

        char[] arr = new char[rsp.length()];
        char[] answerArr = new char[rsp.length()];

        for (int i = 0; i < rsp.length(); i++) {
            arr[i] = rsp.charAt(i);
            if (arr[i] == '0') {
                answerArr[i] = '5';
            } else if (arr[i] == '2') {
                answerArr[i] = '0';
            } else if (arr[i] == '5') {
                answerArr[i] = '2';
            }
        }
        answer = new String(answerArr);

        System.out.println(answer);

        return answer;
    }
}