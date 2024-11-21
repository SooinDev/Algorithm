class Solution {
    public double solution(int[] arr) {
        int total = 0;
        double avg = 0;

        int[] arr2 = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
            total += arr2[i];
            avg = (double) total / arr.length;
        }
        
        return avg;
    }
}