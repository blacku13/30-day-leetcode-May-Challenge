class TrieNode{
    private TrieNode[] links ;
    private boolean isEnd ;
    private int R = 26 ;
    
    public TrieNode(){
        links = new TrieNode[R] ;
    }
    
    public boolean containsKey(char key){
        return links[key-'a'] != null ;
    }
    
    public void  put(TrieNode node,char ch){
        links[ch-'a'] = node ;
    }
    
    public TrieNode get(char ch){
        return links[ch-'a'] ;
    }
    
    public boolean  isEnd(){
        return isEnd ;
    }
    
    public void setEnd(){
         isEnd  = true ;
    }
    
}

class Trie {
 
    private TrieNode root ;
    
    /** Initialize your data structure here. */
    public Trie() {
        root = new TrieNode() ;
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root ;
        
        for(int i = 0; i<word.length() ; i++){
      
            char c = word.charAt(i) ;
            
            if(!node.containsKey(c)) 
                node.put(new TrieNode(), c) ;
            
            node = node.get(c);
        }
        
        node.setEnd() ;
            
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root ;
        
        for(int i = 0; i<word.length() ; i++){
      
            char c = word.charAt(i) ;
            
            if(node.containsKey(c)) 
                node = node.get(c);
            else
                return false;
        }
        return node.isEnd() ; 
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        
        TrieNode node = root ;
        
        for(int i = 0; i<prefix.length() ; i++){
      
            char c = prefix.charAt(i) ;
            
            if(node.containsKey(c)) 
                node = node.get(c);
            else
                return false;
        }
        
        return true ;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
