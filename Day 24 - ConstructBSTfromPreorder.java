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
    int index = 0 ;
    
    TreeNode construct(int[] preorder , int hi, int lo , int size){
        
        if(index>=size) return null ;
        
        TreeNode root = null ;
        int x = preorder[index] ;
        if(x>lo && x<hi){
            root = new TreeNode(x) ;
            index++;
            
            if(index<size){
                root.left = construct(preorder,x,lo,size);
                root.right = construct(preorder,hi,x,size);
            }
        }
        
        return root ;
    }
    
    public TreeNode bstFromPreorder(int[] preorder) {
        int size = preorder.length ;
        int hi  = Integer.MAX_VALUE ;
        int lo  = Integer.MIN_VALUE ;
        TreeNode ans =  construct(preorder,hi,lo,size) ;
        return ans ;
    }
}
