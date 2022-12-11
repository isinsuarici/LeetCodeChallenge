class Solution {
public:
    int hammingDistance(int x, int y) {
        int last_num = x^y;
        int ret=0;
        while(last_num){
            ret+=last_num&1;
            last_num=last_num>>1;
        }
        return ret;
    }
};