class Solution {
    public int firstUniqChar(String s) {
        if(s.length()==0)return -1 ;
        int[]  a = new int[26] ;
        
        for(int i =0 ; i<26 ; i++)
            a[i] = 0 ;
        
        for(int i = 0; i<s.length() ; i++)
            a[s.charAt(i)-'a']++ ;
        int ans=-1 ;
        for(int i = 0; i<s.length() ; i++){
            if(a[s.charAt(i)-'a']==1){
                ans = i ;
                break  ;   
            } 
        }
        return ans ;
    }
}
