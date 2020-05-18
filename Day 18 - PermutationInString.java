class Solution {
    int[] freq = new int[26] ; 
    
    boolean zero(){
        for(int i = 0; i<26 ; i++)
            if(freq[i] != 0) return false ;
        
        return true ;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length() ;
        int m = s2.length() ;
        if(n>m || m==0) return false ;
        for(int i = 0; i<n ; i++){
            freq[s1.charAt(i)-'a']++ ;
            freq[s2.charAt(i)-'a']-- ;
        }
        if(zero()) return true ;
        for(int i = 1 ; i<=m-n ; i++){
            freq[s2.charAt(i-1)-'a']++ ;
            freq[s2.charAt(i+n-1)-'a']-- ;
            
            if(zero()) return true ;
        }
        
        return false ;
    }
}
