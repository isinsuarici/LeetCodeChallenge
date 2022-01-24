public class Solution {
    public int xorOperation(int n, int start) {
        int[] nums= new int[n];
        int sonuc = 0;
        for(int i=0; i<n; i++){
            nums[i]= start+2*i;
            sonuc^=nums[i];
        } return sonuc;

    }
}