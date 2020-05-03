class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean ans  = true ;
        if(ransomNote.length()==0) return true ;
        Map<Character,Integer>m = new HashMap<>() ;
        
        for(char c : magazine.toCharArray())
            m.put(c,m.getOrDefault(c,0)+1) ;
            
        for(char c : ransomNote.toCharArray())
            m.put(c,m.getOrDefault(c,0)-1) ;
        
        for(Integer val : m.values())
            if(val<0) ans = false ;
        
        return ans ;
    }
}
