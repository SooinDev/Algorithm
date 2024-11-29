import java.util.Arrays;

class Solution {
    public long solution(long n) {
        long answer = 0;

        // nString : n을 String으로 변환
        String nString = Long.toString(n);

        // nString을 arr로 변환
        char[] arr = nString.toCharArray();

        // temp
        char[] temp = new char[arr.length];
        Arrays.fill(temp, '0');

        // nString을 오름차순으로 정렬
        Arrays.sort(arr);

        // nString을 내림차순으로 정렬
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length - 1 - i];
        }

        answer = Long.parseLong(new String(temp));

        System.out.println(answer);

        return answer;
    }
}