class Solution {
    public int solution(int[] sides) {
        if ((sides[0] < sides[1] + sides[2]) && (sides[1] < sides[0] + sides[2]) && (sides[2] < sides[0] + sides[1])) {
            System.out.println(1);
            return 1;
        }
        else {
            System.out.println(2);
            return 2;
        }
    }
}