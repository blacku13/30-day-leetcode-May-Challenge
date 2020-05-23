class Solution {
    public int[][] intervalIntersection(int[][] A, int[][] B) {
        
        List<int[]>ans = new ArrayList() ;
        
        int n = A.length ;
        int m = B.length ;
        
        int i =0 , j=0, lo , hi ;
        
        while(i<n && j<m ){
            lo = Math.max(A[i][0],B[j][0]) ;
            hi = Math.min(A[i][1],B[j][1]) ;
            
            if(lo<=hi)
                ans.add(new int[]{lo,hi}) ;
            
            if(A[i][1]<B[j][1])
                i++;
            else
                j++ ;
        }
        
        return ans.toArray(new int[ans.size()][]) ;
        
    }
}
