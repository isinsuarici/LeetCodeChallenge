class Solution {
public:
    vector<int> sortByBits(vector<int>& arr) {
        multiset<pair<int,int>> ms;
        for (int i =0; i<arr.size(); i++){
            int num1s = numof1(arr[i]);
            ms.insert({num1s,arr[i]}); 
        }
        vector<int> res;
        for(auto el: ms){
            res.push_back(el.second);
        }
        return res;
        
    }

    int numof1(int num){
        int cnt=0;
        while(num){
            cnt+=num&1;
            num>>=1;
        }
        return cnt;
    }
};