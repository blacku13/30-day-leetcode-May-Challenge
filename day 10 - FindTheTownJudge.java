class Solution {
    public int findJudge(int N, int[][] trust) {
        int[] in = new int[N+1] ;
        int[] out = new int[N+1];
        int ans = -1 ;
        for(int i = 0; i<trust.length ; i++)
        {
            in[trust[i][1]] += 1 ;
            out[trust[i][0]] += 1 ;
        }
        for(int i =1 ; i<=N; i++)
            if(in[i]==N-1 && out[i]==0) ans= i ;
        return ans ;
    }
}
