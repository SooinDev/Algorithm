class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        //int count = 0;

        String[] arr = cipher.split("");
        String[] answerArr = new String[arr.length / code];

        for (int i = 1; i <= arr.length / code; i++) {
            answerArr[i - 1] = arr[code * i - 1];
        }

        answer = String.join("", answerArr);

        System.out.println(answer);

        return answer;
    }
}