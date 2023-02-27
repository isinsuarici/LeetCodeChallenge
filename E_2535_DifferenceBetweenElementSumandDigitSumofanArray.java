class Solution {
    public int differenceOfSum(int[] nums) {
        int elSum = 0;
        int digitSum = 0;
        for( int num : nums){
            elSum += num;
            while (num > 0){
                digitSum += num%10;
                num = num/10;
            }
        }
        return Math.abs(elSum-digitSum);
    }
}