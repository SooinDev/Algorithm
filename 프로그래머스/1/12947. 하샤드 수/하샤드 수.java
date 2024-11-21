import java.util.Arrays;

class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int total = 0;
        int[] arr = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }

        //System.out.println(Arrays.toString(arr));
        //System.out.println(total);

        if (x % total == 0) {
            answer = true;
        } else {
            answer = false;
        }

        return answer;
    }
}