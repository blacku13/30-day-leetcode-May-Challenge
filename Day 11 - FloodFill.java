class Solution {
    
    void fill(int[][] image, int sr, int sc, int newColor, int old){
         if(sr<0 || sc <0 || sr>=image.length || sc >= image[0].length  )
             return ;
        if(image[sr][sc] != old) 
            return ;
        image[sr][sc] = newColor ;
        
        fill(image,sr+1,sc,newColor,old) ;
        fill(image,sr-1,sc,newColor,old) ;
        fill(image,sr,sc+1,newColor,old) ;
        fill(image,sr,sc-1,newColor,old) ;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
            
            int old = image[sr][sc] ; 
            if(old !=newColor) fill(image,sr,sc,newColor,old) ;
            return image ;
    }
}
