class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int temp1 = 1;
        int temp2 = 0;

        for (int i = 0; i < num_list.length; i++) {
            temp1 = temp1 * num_list[i];
        }

        for (int i = 0; i < num_list.length; i++) {
            temp2 = temp2 +  num_list[i];
        }
        temp2 = (int)Math.pow(temp2, 2);

        if (temp1 < temp2)
            answer = 1;
        else if (temp1 > temp2)
            answer = 0;

        System.out.println(temp1);
        System.out.println(temp2);

        return answer;
    }
}