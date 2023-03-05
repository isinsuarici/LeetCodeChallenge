class Solution {
    public String firstPalindrome(String[] words) {
        for (String el: words){
            int left=0;
            int right= el.length()-1;
            int len=el.length();
            if(len==1)
                return el;
            while(left<right){
                if(el.charAt(left++)!=el.charAt(right--)){
                    break;
                }
                if(left==right && len%2==1)
                    return el;
                else if(left-right==1 && len%2==0)
                    return el;
            }
        }
        return "";
    }
}