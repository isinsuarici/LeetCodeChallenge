class Solution {
    public int numberOfSteps (int n) {
        if ( n == 0) {
            return 0;
        }
        return 1 + numberOfSteps(n % 2 == 0 ? n / 2 : n - 1);
    }
}