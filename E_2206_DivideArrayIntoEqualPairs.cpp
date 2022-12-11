class Solution {
public:
    bool divideArray(vector<int>& nums) {
        unordered_map<int,int> num_map;
        for(int i=0; i<nums.size(); i++){
            num_map[nums[i]]++;
        }
        int pairs=0;
        for(auto el:num_map){
            pairs+= el.second/2;
        }
        return pairs==nums.size()/2;
    }
};