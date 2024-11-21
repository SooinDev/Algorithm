class Solution {
    public int solution(int hp) {
        int answer = 0;
        int first = 5;
        int second = 3;
        int third = 1;
        int temp1;
        int temp2;
        int temp3;

        temp1 = hp / first;
        temp2 = (hp - (temp1 * first)) / second;
        temp3 = hp - (temp1 * first) - (temp2 * second);

        answer = temp1 + temp2 + temp3;

        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(temp3);
        System.out.println(answer);

        return answer;
    }
}