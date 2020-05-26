class Solution {
    public int maxUncrossedLines(int[] A, int[] B) {
        int n=  A.length ;
        int m=  B.length ;
        int[][] dp = new int[n+1][m+1];
        
        for(int i = n-1 ; i>=0 ; i--)
            for(int j = m-1 ; j>=0 ; j--)
              dp[i][j] = (A[i]==B[j] ) ? dp[i+1][j+1]+1 : Math.max(dp[i+1][j],dp[i][j+1]) ;
        
        return dp[0][0] ;
    }
}
