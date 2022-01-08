class Solution {
    public String removeOuterParentheses(String S) {
        // 3 ms
        int L = 0, R = 0;
        StringBuilder sonuc = new StringBuilder();
        StringBuilder temp= new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '(')
                L++;
            else if (S.charAt(i) == ')')
                R++;
            if (L == R) {
                for(int x=i-L-R+1; x<i+1;x++){
                    temp.append(S.charAt(x));
                }
                for (int j = 1; j < L+R-1; j++) {
                    sonuc.append(temp.charAt(j));
                }
                L=0; R=0;
                temp = new StringBuilder();

            }
        }

        return sonuc.toString();
    }
}