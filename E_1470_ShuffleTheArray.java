public class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] sonuc = new int[nums.length];
        int i=0;
        for(int j=0;j<n; j++) {
                sonuc[i] = nums[j+0];
                sonuc[i + 1] = nums[j+n];
                i=i+2;
            }
        return sonuc;
    }
}