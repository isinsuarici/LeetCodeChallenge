public class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        int uzunluk=arr.length;
           if(arr.length%2!=1) uzunluk=arr.length-1;
           while (uzunluk % 2 == 1) {
               for (int i = 0; i < arr.length; i++) {
                   if (i + uzunluk < arr.length + 1) {
                       for (int j = i; j < uzunluk + i; j++) {
                           sum += arr[j];
                       }
                   }
               }
               uzunluk = uzunluk - 2;
           }
        return sum;
        }
    }