class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> vars= new HashSet<Integer>();
        int res=0;
        while(n!=1){
            while(n>=10){
                res+=Math.pow(n%10,2);
                n/=10;
            }
            res+=Math.pow(n,2);
            n=res;
            res=0;
            if(!vars.contains(n))
                vars.add(n);
            else return false;
        }            
        if(n==1)
            return true;
        return false;
    }
}