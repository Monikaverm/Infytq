//Monika Verma (1900290120068) 
public class ValidateBinarySearchTree  {
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        
        
        return check(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
        
        
        
    }
    
    private boolean check(TreeNode root, int left, int right){
        
        if (root==null){
            return true;
        }
        
       if (root.val<=left ||root.val>=right){
           return false;
       }
       
       return check(root.left, left, root.val) && check(root.right, root.val, right);
    
    }
}

public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root==null){
            return true;
        }
        int[] pre={Integer.MIN_VALUE};
        
        return check(root, pre);
        
        
        
    }
    
    private boolean check(TreeNode root, int[] pre){
        
        if (root==null){
            return true;
        }
        
        if (!check(root.left, pre)){
            return false;
        }
        
        if (pre[0]>=root.val){
            return false;
        }
        else{
            
            pre[0]=root.val;
        }
        
        if (!check(root.right, pre)){
            return false; 
        }
        
        return true;
    }
}
