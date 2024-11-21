import java.util.Arrays;

class Solution {
    public String solution(String my_string, int n) {

        char[] arr = my_string.toCharArray();
        char[] chararr = new char[n];

        System.out.println(Arrays.toString(arr));

        int index = 0;

        for (int i = arr.length - n; i < arr.length; i++) {
            chararr[index++] = arr[i];
        }

        System.out.println(Arrays.toString(chararr));

        String answer = new String(chararr);

        System.out.println(answer);
        return answer;
    }
}