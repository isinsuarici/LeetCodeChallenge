public class Solution {
    public int subtractProductAndSum(int n) {
        int toplam=0,carpim=1;
        while(n!=0) {
            toplam= (n%10)+toplam;
            carpim= (n%10)*carpim;
            n/=10;
        }
        return carpim-toplam;
    }
}