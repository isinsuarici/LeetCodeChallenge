class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] ret= new int[nums.length];
        int left=0; int right=nums.length-1;
        int num_pivot=0;
        for(int i=0;i<nums.length;i++){
           if(nums[i]<=pivot){
               if(nums[i]==pivot)
                   num_pivot++;
               else
               ret[left++]=nums[i];
           }
           if(nums[nums.length-1-i]>pivot){
               ret[right--]=nums[nums.length-1-i];
           } 
        }
        for(int i=left; i<left+num_pivot;i++){
            ret[i]=pivot;
        }
        return ret;
    }
}