public class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] sonuc= new int[nums.length];
        for(int i=0; i nums.length; i++) {
            int counter=0;
            for(int j=0; jnums.length; j++){
                if(nums[j]nums[i] && j!=i  ) {
                    counter++;
                    sonuc[i]=counter;
                }
            }
        } return sonuc;

    }
}