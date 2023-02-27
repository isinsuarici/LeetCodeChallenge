class Solution {
    public int maximumDifference(int[] nums) {
        int min=2147483647;
        int max=-1;
        int diff=-1;
        for(int i: nums){
            if(i<=min){
                min=i;
                max=-1;
            }
            else if(max<i){
                max=i;
                if(max-min>diff){
                    diff=max-min;
                }

            }
        }
        return diff;
    }
}