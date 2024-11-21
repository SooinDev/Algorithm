class Solution {
    public int solution(long num) {
        int answer = 0;
        int index = 0;

        if (num == 1) {
            index = 0;
        } else {
            while (true) {
                if (num % 2 == 0) {
                    num = num / 2;
                    index++;
                    if (num == 1)
                        break;
                } else if (num % 2 == 1) {
                    num = num * 3 + 1;
                    index++;
                    if (num == 1)
                        break;
                }
            }
        }
        

        if (index >= 500) {
            index = -1;
        }

        answer = index;
        System.out.println(answer);
        return answer;
    }
}