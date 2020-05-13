class Solution {
    public String removeKdigits(String num, int k) {
        int n = num.length() ;
        if(k==0) return num ;
        if(k==n) return "0" ;
        
        Stack<Character>st = new Stack<>() ;
        int i  = 0 ;
        while(i<n)
        {
            while(k>0 && !st.isEmpty() && st.peek()>num.charAt(i))
            {
                st.pop() ;
                k-- ;
            }
            st.push(num.charAt(i++)) ;
        }
        
        while(k-- >0 ) st.pop() ;
        
        String ans="" ;
        
        while(!st.isEmpty()) ans =st.pop()+ans ;
        
        while(ans.length()>1 && ans.charAt(0)=='0')
            ans = ans.substring(1) ;
        
        return ans ;
    }
}
