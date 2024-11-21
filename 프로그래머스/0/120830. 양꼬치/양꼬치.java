class Solution {
    public int solution(int n, int k) {
        int total = 0;

        total = (n * 12000) + (k * 2000);

        if (n / 10 >= 0) {
            total = total - ((n / 10) * 2000);
        }

        System.out.println(total);

        return total;
    }
}