import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int count = 0;
        int[] answer;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0)
                count++;
        }

        answer = new int[count];

        if (count == 0)
            return new int[] {-1};

        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                answer[index++] = arr[i];
            }
        }

        Arrays.sort(answer);
        
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}