class Solution {
    public int[] rearrangeArray(int[] nums) {
        int ret[] = new int[nums.length];
        int even=0;
        int odd=1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]>0){
                ret[even]=nums[i];
                even+=2;
            }
            else{
                ret[odd]=nums[i];
                odd+=2;
            }
        }
        return ret;
    }
}