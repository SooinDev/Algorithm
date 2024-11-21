class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int cnta = 0;
        int cntb = 0;

        for (int i = 0; i < num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                cnta++;
            } else {
                cntb++;
            }
        }

        answer[0] = cnta;
        answer[1] = cntb;

        System.out.println(answer[0] + ", " + answer[1]);
        return answer;
    }
}