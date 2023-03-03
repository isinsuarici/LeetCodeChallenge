class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int left=0;
        int right=nums.length-1;
        int ret=0;
        while (left<right){
            if(ret<nums[left]+ nums[right])
                ret=nums[left]+ nums[right];
            left++;
            right--;
        }
        return ret;
    }
}