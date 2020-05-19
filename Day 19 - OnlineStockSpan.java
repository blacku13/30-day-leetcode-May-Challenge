class StockSpanner {
    Stack<Integer> prices,days ;
    public StockSpanner() {
        days = new Stack() ;
        prices = new Stack() ;
    }
    
    public int next(int price) {
        int d = 1 ;
        while(!prices.isEmpty()  && prices.peek() <= price){
            d += days.pop() ;    
            prices.pop() ;
                
        }
        
        prices.push(price) ;
        days.push(d) ;
        
        return d ;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */
