/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int findDepth(TreeNode root, int lvl, int a){
        if(root==null) return 0 ;
        
        if(root.val == a) return lvl ;

        int l = findDepth(root.left,lvl+1,a) ;
        if(l!=0) return l ;
        
        return findDepth(root.right,lvl+1,a) ;
    }
    
    boolean isSibling(TreeNode root, int x, int y){
        if(root==null) return false ;
        
        boolean b1  = false , b2= false ,b3 = false , b4 = false; 
        
        if(root.left != null) b1 = isSibling(root.left , x, y) ;
        if(root.right != null) b2 = isSibling(root.right , x, y) ;
        
        if(root.left != null && root.right != null)
        {
            b3 = (root.left.val == x && root.right.val == y) ;
            b4 = (root.left.val == y && root.right.val == x) ;
        }
        return (  b4|| b3 || b1 || b2 ) ;
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        
        return(findDepth(root,0,x)  == findDepth(root,0,y)  && !isSibling(root,x,y)) ;
    }
}
