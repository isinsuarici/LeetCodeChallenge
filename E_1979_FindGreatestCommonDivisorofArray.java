class Solution {
    public int findGCD(int[] nums) {
        int min=1001;
        int max=0;
        int ebob=1;
        for(int i=0; i<nums.length;i++){
            if(nums[i]<min)
                min=nums[i];
            if(nums[i]>max)
                max=nums[i]; 
        }
        for(int i=1;i<=max && i<=min; i++){
            if(max%i==0 && min%i==0)
                ebob=i;
        }
        return ebob;
    } 
}