class Solution {
    public String gcdOfStrings(String str1, String str2) {
        String ret= "";
        if(!(str1+str2).equals(str2+str1)) return "";
        else{
            int sub = gcd(str1.length(),str2.length());
            ret = str1.substring(0,sub);
        }
        return ret;
    }

    public int gcd(int len1, int len2){
        if(len2==0)
            return len1;
        else
            return gcd(len2,len1 % len2);
    }
}