class Solution {
    public int maxProfit(int[] prices) {
        int min=100000;
        int max=-1;
        int diff=0;
        for(int i: prices){
            if(i<min){
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