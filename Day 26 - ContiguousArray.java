class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>sums = new HashMap<>() ;
        int sum  = 0 ;
        sums.put(0,0) ;
        int ans = 0 ;
        for(int i =1 ; i<=nums.length ; i++){
            if(nums[i-1]==1) sum += 1 ;
            else sum -= 1 ;
            
            int last = sums.getOrDefault(sum,-1)  ;
            if(last==-1)
                sums.put(sum,i) ;
            else
                ans = Math.max(ans,i-last) ;
        }
        
        return ans ;
    }
}
