import java.util.Arrays;

class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int index = 0;
        int index2 = 0;
        int[] array = new int[right - left + 1];
        int[] divarray = new int[right - left + 1];

        for (int i = left; i <= right; i++) {
            int div = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    div++;
                }
            }
            divarray[index] = div;
            index++;
        }

        for (int i = left; i <= right; i++) {
            array[index2] = i;
            index2++;
        }

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(divarray));

        for (int i = 0; i < index2; i++) {
            if (divarray[i] % 2 == 0) {
                answer = answer + array[i];
            } else {
                answer = answer - array[i];
            }
        }
        System.out.println(answer);

        return answer;
    }
}