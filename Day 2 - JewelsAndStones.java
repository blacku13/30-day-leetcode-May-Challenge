class Solution {
public:
    int numJewelsInStones(string J, string S) {
        unordered_map<char,int>m;
        for(int i = 0; i<J.size(); i++)
            m[J[i]]++ ;
        int ans =0  ;
        for(int i = 0; i<S.size() ; i++)
            if(m[S[i]])ans++;
        
        return ans ;
    }
};
