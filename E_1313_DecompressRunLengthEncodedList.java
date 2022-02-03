public class Solution {
    public int[] decompressRLElist(int[] nums) {
        int uzunluk = 0;
        int k;

        for(k=0; k<nums.length; k=k+2) {
            uzunluk+= nums[k];
        }

        int[] sonuc = new int[uzunluk];
        k=0;

        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                sonuc[k] = nums[i + 1];
                k++;
            }
        }
        return sonuc;

    }

}