class Solution {
    public int solution(int angle) {
        if (angle > 0 && angle <= 180) {
            if (angle > 0 && angle < 90) {
                return 1;
            } else if (angle == 90) {
                return 2;
            } else if (angle > 90 && angle < 180) {
                return 3;
            } else if (angle == 180) {
                return 4;
            }
        } else {
            System.out.println("재입력");
        }
        return 0;
    }
}