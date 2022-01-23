public class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int kactane = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'L')
                kactane++;
            else
                kactane--;
            if (kactane == 0)
                count++;
        }

        return count;
    }
}