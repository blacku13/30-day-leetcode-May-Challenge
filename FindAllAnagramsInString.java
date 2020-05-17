class Solution {
    int[] S = new int[26] ;
    int[] P = new int[26] ;
    
    boolean check(){
        for(int i =0 ; i<26 ; i++)
            if(S[i] != P[i] ) return false ;
        
        return true ;
    }
    
    public List<Integer> findAnagrams(String s, String p) {
        
        int m   = p.length()  ;
        int n   = s.length()  ;
        List<Integer> ans  = new ArrayList<>() ;
        
        if(s.isEmpty() || m>n ) return ans ;
        
        for(int i = 0; i<m ; i++){
           P[p.charAt(i)-'a']++ ;
           S[s.charAt(i)-'a']++ ;
        }
             
        if(check()) ans.add(0) ;
        for(int i = 1 ; i<=n-m ; i++){
            S[s.charAt(i-1)-'a']-- ;
            S[s.charAt(i+m-1)-'a']++ ;
            
            if(check())
                ans.add(i) ;
        }
        
        return ans ;
    }
}
