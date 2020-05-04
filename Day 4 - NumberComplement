class Solution {
    public int findComplement(int num) {
        int[] lst = new int[32] ;
        int ans = 0 ;
        for(int i = 31 ; i>=0 ; i--)
        {
            int k  = num>>i ;
            if((k&1)>0)
                lst[i]=1;
            else
                lst[i]=0;
        }
        
        int i =31;
        while(i>=0 && lst[i]==0) i-- ;
        
        for( ; i>=0 ; i--)
            if(lst[i]==0)ans += Math.pow(2,i) ;
        
        return ans ;
    }
}
