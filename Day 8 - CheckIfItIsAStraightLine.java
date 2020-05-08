class Solution {
    public boolean checkStraightLine(int[][] c) {
        int n = c.length ;
        if(n==2) return true ;
        
        int m1 = c[1][1] - c[0][1] ;
        int m2 = c[1][0] - c[0][0] ;
        
        for(int i  = 2 ; i<n ; i++)
        {
             int p1 = c[i][1] - c[i-1][1] ;
             int p2 = c[i][0] - c[i-1][0] ;
            
            if(m1*p2 != m2*p1) return false ;
        }
        
        return true ;
    }
}
