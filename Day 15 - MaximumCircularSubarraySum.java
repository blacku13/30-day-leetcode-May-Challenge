class Solution {
    
    int kadane(int[] A, int n ){
        int maxSoFar = Integer.MIN_VALUE,maxEndingHere=0 ;
        
        for(int i = 0; i<n ; i++){
            
            maxEndingHere += A[i] ;
            if(maxEndingHere>maxSoFar) maxSoFar = maxEndingHere ;
            if(maxEndingHere<=0) maxEndingHere = 0 ;
            
                
        }
        return maxSoFar ;
    }
    public int maxSubarraySumCircular(int[] A) {
        int n = A.length ;
        int ans1 = kadane(A,n) ;
        int ans2 = 0 ;

        for(int i = 0;  i< n; i++){
            ans2 += A[i] ;
            A[i] = -A[i] ;
        }
        
        ans2 = ans2 + kadane(A,n) ;
        
        if(ans2==0) return ans1 ;   //when all elements ar negative
        return Math.max(ans1,ans2) ;
    }
}
