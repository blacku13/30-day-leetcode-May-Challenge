class Solution {
    
    private class Node{
        int f ;
        char c ;
        
        Node(char c , int f){
            this.c = c ;
            this.f = f ;
        }
    }
    
    public String frequencySort(String s) {
        Map<Character,Integer>count = new HashMap<>() ;
        
        for(int i  = 0 ; i<s.length() ; i++){
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1) ;
        }
        
       PriorityQueue<Node>pq = new PriorityQueue<Node>((a,b) -> Integer.compare(b.f,a.f)) ;
            
       for(char c : count.keySet()){
           pq.add(new Node(c,count.get(c)));
       }
        
        StringBuilder ans = new StringBuilder();
        
        while(!pq.isEmpty()){
            Node tmp = pq.poll() ;
            
            for(int i =0 ; i<tmp.f ; i++)
                ans.append(tmp.c) ;
        }
        
        return ans.toString() ;
    }
}
